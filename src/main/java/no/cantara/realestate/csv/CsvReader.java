package no.cantara.realestate.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.slf4j.LoggerFactory.getLogger;

public class CsvReader {
    private static final Logger log = getLogger(CsvReader.class);

    /**
     * Parse CSV file into CsvCollection
     * @param csvFilePath
     * @return CsvCollection of all lines
     * @throws RealEstateCsvException if the file cannot be read, or if a single line causes an error.
     */
    public static CsvCollection parse(String csvFilePath) throws RealEstateCsvException {
        return parse(csvFilePath, false);
    }

    /**
     * Parse CSV file into CsvCollection
     * @param csvFilePath
     * @param ignoreSingleLineErrors - if true, will log and skip lines that cause errors instead of throwing exception
     * @return CsvCollection of the lines without errors
     * @throws RealEstateCsvException if the file cannot be read.
     */
    public static CsvCollection parse(String csvFilePath, boolean ignoreSingleLineErrors) throws RealEstateCsvException {
        List<String> columnNames = null;
        List<Map<String, String>> records = new ArrayList<>();
        CsvCollection collection = null;
        try (

                Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim());
        ) {
            columnNames = csvParser.getHeaderNames();
            collection = new CsvCollection(columnNames, records);
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by Header names
                try {
                    Map<String,String> record = new HashMap<>();
                    for (String columnName : columnNames) {
                        record.put(columnName, csvRecord.get(columnName));
                    }
                    records.add(record);
                } catch (Exception e) {
                    log.warn("CsvImport of single line failed. File: {}. Line num: {}: Record: {}. Reason: {}",csvFilePath,
                            csvRecord.getRecordNumber(), csvRecord, e.getMessage());
                    if (!ignoreSingleLineErrors) {
                        throw new RealEstateCsvException("CsvImport of single line failed. File: " + csvFilePath +
                                ". Line num: " + csvRecord.getRecordNumber() + ": Record: " + csvRecord +
                                ". Reason: " + e.getMessage(), e);
                    }
                }
            }
        } catch (IOException e) {
            log.warn("Failed to read file: {}. Reason: {}", csvFilePath, e.getMessage());
            throw new RealEstateCsvException("Failed to read file: " + csvFilePath  + " Reason: " + e.getMessage(),e);
        }
        return collection;
    }

    public static List<String> findTrendIds(String csvFilePath) {
        List<String> trendIds = new ArrayList<>();
        try (

                Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim());
        ) {
            List<String> columnNames = csvParser.getHeaderNames();
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by Header names
                String trendId = csvRecord.get("TrendId");
                trendIds.add(trendId);
            }
        } catch (IOException e) {
            log.warn("Failed to read file: {}. Reason: {}", csvFilePath, e.getMessage());
        }
        return trendIds;
    }

    public static Map<String, String> findObjectIds(String csvFilePath) {
        Map<String, String> objectReferences = new HashMap<>();
        try (

                Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim());
        ) {
            List<String> columnNames = csvParser.getHeaderNames();
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by Header names
                String objectId = csvRecord.get("MetasysObjectId");
                String metasysDbReference = csvRecord.get("MetasysObjectReference");
                objectReferences.put(objectId, metasysDbReference);
            }
        } catch (IOException e) {
            log.warn("Failed to read file: {}. Reason: {}", csvFilePath, e.getMessage());
            throw new RealEstateCsvException("Failed to read file: " + csvFilePath  + " Reason: " + e.getMessage(),e);
        }
        return objectReferences;
    }

    public static Map<String,String> findObservationTypes(String csvFilePath) {
        Map<String,String> trendIds = new HashMap<>();
        try (

                Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                        .withFirstRecordAsHeader()
                        .withIgnoreHeaderCase()
                        .withTrim());
        ) {
            List<String> columnNames = csvParser.getHeaderNames();
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by Header names
                String trendId = csvRecord.get("observationType");
                String lastUpdated = csvRecord.get("lastImportAt");
                trendIds.put(trendId, lastUpdated);
            }
        } catch (IOException e) {
            log.warn("Failed to read file: {}. Reason: {}", csvFilePath, e.getMessage());
        }
        return trendIds;
    }

    public static void main(String[] args) {
        String filePath = "import-data/flow.csv";
        List<String> trendIds = findTrendIds(filePath);
        log.info("Found {} TrendIds", trendIds.size());
    }
}

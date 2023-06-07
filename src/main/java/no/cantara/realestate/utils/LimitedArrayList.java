package no.cantara.realestate.utils;

import java.util.ArrayList;

public class LimitedArrayList<E> extends ArrayList<E> {
    private static final long serialVersionUID = -23456691722L;
    private final int limit;

    public LimitedArrayList(int limit) {
        this.limit = limit;
    }

    @Override
    public synchronized boolean add(E object) {
        if (this.size() >= limit) {
            super.remove(0);
            return add(object);
        }
        return super.add(object);
    }

}

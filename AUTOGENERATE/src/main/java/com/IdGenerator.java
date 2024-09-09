package com;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {

    private static final AtomicInteger idCounter = new AtomicInteger(1);
    private static final DecimalFormat idFormat = new DecimalFormat("00000");
    private static final DecimalFormat movieIdFormat = new DecimalFormat("MV_00000");

    public static String generateId() {
        return "id_" + idFormat.format(idCounter.getAndIncrement());
    }

    public static String generateMovieId() {
        return movieIdFormat.format(idCounter.getAndIncrement());
    }
}

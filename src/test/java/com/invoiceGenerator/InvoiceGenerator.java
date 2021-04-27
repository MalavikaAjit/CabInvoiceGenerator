package com.invoiceGenerator;

public class InvoiceGenerator {
    private static final double MIN_FARE_PER_KM = 10;
    private static final int MIN_FARE_PER_MINUTE = 1;

    public double CalculateFare(double distance, int time){
        return distance * MIN_FARE_PER_KM + time * MIN_FARE_PER_MINUTE;
    }
}

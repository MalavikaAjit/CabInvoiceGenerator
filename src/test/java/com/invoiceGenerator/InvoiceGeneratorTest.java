package com.invoiceGenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    @Test
    public void GivenDistanceAndTime_ShouldReturn_Fare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.CalculateFare(2.0,5);
        Assertions.assertEquals(25.0,fare);
    }
}

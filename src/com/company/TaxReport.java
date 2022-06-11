package com.company;

public class TaxReport {
    private ITaxCalculator taxCalculator;

    public TaxReport(ITaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public String taxReport(){
        return "" + taxCalculator.calculateTax();
    }
}

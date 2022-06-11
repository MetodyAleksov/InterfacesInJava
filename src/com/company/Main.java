package com.company;

public class Main {

    public static void main(String[] args) {
	    TaxCalculator calculator = new TaxCalculator(10000);
        TaxReport report = new TaxReport(calculator);

        System.out.println(report.taxReport());
    }
}

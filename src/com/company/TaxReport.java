package com.company;

public class TaxReport {

    private ITaxCalculator taxCalculator;

    //dependency injection through the constructor
    public TaxReport(ITaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    //dependency injection through a setter
    public void setTaxCalculator(ITaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    //Dependency injection through a method
    public void chooseTaxCalculator(CalculatorType type){
        if(type == CalculatorType.Default){
            taxCalculator = new TaxCalculator(10000);
        }
    }

    public String taxReport(){
        return "" + taxCalculator.calculateTax();
    }
}

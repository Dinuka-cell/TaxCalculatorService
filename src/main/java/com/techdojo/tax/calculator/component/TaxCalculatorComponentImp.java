package com.techdojo.tax.calculator.component;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculatorComponentImp implements TaxtCalculatorComponent {
    @Override
    public double calculateTax(double income) {
        if (income > 0 && income <= 14000) {return income * ((15.5) / 100);}
        if (income > 14001 && income <= 48000) {return income * ((17.5) / 100);}
        if (income > 48001 && income <= 70000) {return income * ((30.0) / 100);}
        if (income > 70001 && income <= 180000) {return income * ((33.0) / 100);}
        if (income > 180001 && income <= 300000 ) {return income * ((39.0) / 100);}


        return income *((10.5)/100);
    }
}
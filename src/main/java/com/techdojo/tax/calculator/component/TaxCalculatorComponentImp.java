package com.techdojo.tax.calculator.component;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculatorComponentImp implements TaxtCalculatorComponent {
    @Override
    public double calculateTax(double income) {
        if (income > 14000 && income <= 48000) {
            return income * ((17.5) / 100);
        }

        return income * ((10.5) / 100);
    }
}
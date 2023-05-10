package com.techdojo.tax.calculator.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaxCalculatorComponentImpTest {
    @Autowired
    TaxtCalculatorComponent taxCalculatorComponent; /*
     *  Tax brackets
     * Tax bracket A(0 to 14k) = 10.5%
     * Tax bracket B($14,001 to $48,000) = 17.50%
     * Tax bracket C($48,001 to $70,000) = 30.00%
     * Tax bracket D($70,001 to $180,000) = 33.00%
     * Tax bracket E($180,000 to 300000) = 39.00%
     * */

    @Test
    void taxBracketAisAppliedWhenIncomeIsBellow14k() {
        double income = 14000.00;
        double actualTaxToPay = taxCalculatorComponent.calculateTax(income);
        double expectedTaxToPay = income * (15.5 / 100);
        Assertions.assertEquals(expectedTaxToPay, actualTaxToPay, "Amount is not as expected ");
    }
    @Test
    void taxBracketBisAppliedWhenIncomeIsBellow14k() {
        double income = 48000.00;
        double actualTaxToPay = taxCalculatorComponent.calculateTax(income);
        double expectedTaxToPay = income * (17.5 / 100);
        Assertions.assertEquals(expectedTaxToPay, actualTaxToPay, "Amount is not as expected ");
    }
    @Test
    void taxBracketCisAppliedWhenIncomeIsBellow14k() {
        double income = 70000;
        double actualTaxToPay = taxCalculatorComponent.calculateTax(income);
        double expectedTaxToPay = income * (30.0 / 100);
        Assertions.assertEquals(expectedTaxToPay, actualTaxToPay, "Amount is not as expected ");
    }
    @Test
    void taxBracketDisAppliedWhenIncomeIsBellow14k() {
        double income = 180000;
        double actualTaxToPay = taxCalculatorComponent.calculateTax(income);
        double expectedTaxToPay = income * (33.0 / 100);
        Assertions.assertEquals(expectedTaxToPay, actualTaxToPay, "Amount is not as expected ");
    }
    @Test
    void taxBracketEisAppliedWhenIncomeIsBellow14k() {
        double income = 300000;
        double actualTaxToPay = taxCalculatorComponent.calculateTax(income);
        double expectedTaxToPay = income * (39.0 / 100);
        Assertions.assertEquals(expectedTaxToPay, actualTaxToPay, "Amount is not as expected ");
    }

}




package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sum() {
        Calculator calculator = new Calculator();
        calculator.A = 5;
        calculator.B = 3;

        Double actual = calculator.A + calculator.B;
        Assert.assertEquals(8, actual, 1);
    }

    @Test
    public void subtraction() {
        Calculator calculator = new Calculator();
        calculator.A = 5;
        calculator.B = 3;

        Double actual = calculator.A - calculator.B;
        Assert.assertEquals(2, actual, 1);
    }

    @Test
    public void multiplication() {
        Calculator calculator = new Calculator();
        calculator.A = 5;
        calculator.B = 3;

        Double actual = calculator.A * calculator.B;
        Assert.assertEquals(15, actual, 1);
    }

    @Test
    public void division() {
        Calculator calculator = new Calculator();
        calculator.A = 5;
        calculator.B = 3;

        Double actual = calculator.A / calculator.B;
        Assert.assertEquals(1.66, actual, 1);
    }

    @Test
    public void persent() {
        Calculator calculator = new Calculator();
        calculator.A = 5;
        calculator.B = 3;

        Double actual = calculator.A % calculator.B;
        Assert.assertEquals(2, actual, 1);
    }
}
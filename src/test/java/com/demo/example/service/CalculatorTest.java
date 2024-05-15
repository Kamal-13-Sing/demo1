package com.demo.example.service;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){

        int result = Calculator.add(2,5);

        int expected= 7;

        Assert.assertEquals(expected, result);

    }

    @Test
    public void productTest(){
        int result = Calculator.product(2,3);
        int expected = 6;

        Assert.assertEquals(expected, result);
    }
}

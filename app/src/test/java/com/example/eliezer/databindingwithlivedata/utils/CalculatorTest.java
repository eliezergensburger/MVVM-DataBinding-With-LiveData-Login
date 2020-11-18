package com.example.eliezer.databindingwithlivedata.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    void add() {
        int x =67;
        int y =99;

        int result = calculator.add(x,y);
        assertEquals(x+y,result);
    }
}
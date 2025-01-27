package com.abishek.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
//    @Test
//    void twoPlusTwoEquals4(){
//        var calculator = new Calculator();
//        assertEquals(5,calculator.add(2,2));
//    }
//    @Test
//    void sumCannotBeNegative(){
//        var calc = new Calculator();
//        assertThrows(IllegalArgumentException.class,
//                ()->{
//                    calc.add(2,-3);
//                });
//    }

    @Test
    void sumEqualsFive(){
        var calc= new Calculator();
        assertEquals(6,calc.add(2,3));
    }

}
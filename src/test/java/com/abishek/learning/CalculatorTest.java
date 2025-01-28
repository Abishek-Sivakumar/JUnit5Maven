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
        assertEquals(6,calc.add(2,3),"Just Kidding the sum of 2 and 3 is 5");
    }

   @Test
    void checkArrays(){
       int[] arr1 = {1,2,3,4};
       int[] arr2 = {3,2,1,4};
       assertArrayEquals(arr1,arr2);
   }

}
package com.abishek.learning;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
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


    Calculator calc;

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all the tests");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all the tests");
    }

    @BeforeEach
    void initCalc(){
       calc = new Calculator();
        System.out.println("Before performing each Unit Test");
    }

    @AfterEach
    void exitCalc(){
        System.out.println("All tests were run");
    }

    @Test
    void sumEqualsFive(){
        var calc= new Calculator();
//        assertEquals(6,calc.add(2,3),"Just Kidding the sum of 2 and 3 is 5");
        assertTimeout(Duration.ofMillis(100),()->calc.add(2,3));
        System.out.println("End of test");
    }

   @Test
    void checkArrays(){
       int[] arr1 = {1,2,3,4};
       int[] arr2 = {1,2,3,4};
       assertArrayEquals(arr1,arr2);
       System.out.println("End of test");
   }

}
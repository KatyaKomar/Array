package test.by.komar.service;

import task.by.komar.entity.EntityArray;
import task.by.komar.exception.ArrayException;
import task.by.komar.service.ArrayCalculationService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayCalculationServiceTest {

    @Test
    public void testSumOfArray() throws ArrayException {
        ArrayCalculationService calculation = new ArrayCalculationService();
        EntityArray arr = new EntityArray(1, 2, 3, 4, 5);
        int actualSum = calculation.sumOfArray(arr);
        int expectedSum = 15;
        assertEquals(actualSum, expectedSum, 0.001, "Test failed as...");
    }

    @Test
    public void testFindAverage() throws ArrayException {
        ArrayCalculationService calculation = new ArrayCalculationService();
        EntityArray arr = new EntityArray(1, 2, 2, 4, 5);
        double actualAverage = calculation.findAverage(arr);
        double expectedAverage = 2.8;
        assertEquals(actualAverage, expectedAverage, 0.001, "Test failed as...");
    }

    @Test
    public void testCountPositiveElements() throws ArrayException {
        ArrayCalculationService calculation = new ArrayCalculationService();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        int actualNumber = calculation.countPositiveElements(arr);
        int expectedNumber = 3;
        assertEquals(actualNumber, expectedNumber, 0.001, "Test failed as...");
    }

    @Test
    public void testCountNegativeElements() throws ArrayException {
        ArrayCalculationService calculation = new ArrayCalculationService();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        int actualNumber = calculation.countNegativeElements(arr);
        int expectedNumber = 2;
        assertEquals(actualNumber, expectedNumber, 0.001, "Test failed as...");
    }

    @Test(expectedExceptions = ArrayException.class)
    public void testSumOfArrayException() throws ArrayException {
        ArrayCalculationService calculation = new ArrayCalculationService();
        EntityArray arr = new EntityArray();
        int actualNumber = calculation.countPositiveElements(arr);
    }
}
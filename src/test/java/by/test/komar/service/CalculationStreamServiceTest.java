package by.test.komar.service;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.service.impl.CalculationStreamServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculationStreamServiceTest {

    @Test
    public void testSumOfArray() throws ArrayException {
        CalculationStreamServiceImpl calculation = new CalculationStreamServiceImpl();
        EntityArray arr = new EntityArray(1, 2, 3, 4, 5);
        int actualSum = calculation.sumOfArray(arr);
        int expectedSum = 15;
        assertEquals(actualSum, expectedSum, 0.001, "Test failed as...");
    }

    @Test
    public void testFindAverage() throws ArrayException {
        CalculationStreamServiceImpl calculation = new CalculationStreamServiceImpl();
        EntityArray arr = new EntityArray(1, 2, 2, 4, 5);
        double actualAverage = calculation.findAverage(arr);
        double expectedAverage = 2.8;
        assertEquals(actualAverage, expectedAverage, 0.001, "Test failed as...");
    }

    @Test
    public void testCountPositiveElements() throws ArrayException {
        CalculationStreamServiceImpl calculation = new CalculationStreamServiceImpl();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        int actualNumber = calculation.countPositiveElements(arr);
        int expectedNumber = 3;
        assertEquals(actualNumber, expectedNumber, 0.001, "Test failed as...");
    }

    @Test
    public void testCountNegativeElements() throws ArrayException {
        CalculationStreamServiceImpl calculation = new CalculationStreamServiceImpl();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        int actualNumber = calculation.countNegativeElements(arr);
        int expectedNumber = 2;
        assertEquals(actualNumber, expectedNumber, 0.001, "Test failed as...");
    }

    @Test(expectedExceptions = ArrayException.class)
    public void testSumOfArrayException() throws ArrayException {
        CalculationStreamServiceImpl calculation = new CalculationStreamServiceImpl();
        EntityArray arr = new EntityArray();
        int actualNumber = calculation.countPositiveElements(arr);
    }
}
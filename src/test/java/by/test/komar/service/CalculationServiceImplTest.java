package by.test.komar.service;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.service.impl.CalculationServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculationServiceImplTest {

    @Test
    public void testSumOfArray() throws ArrayException {
        CalculationServiceImpl calculation = new CalculationServiceImpl();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        int actualSum = calculation.sumOfArray(arr);
        int expectedSum = 3;
        assertEquals(actualSum, expectedSum, 0.001, "Test failed as...");
    }

    @Test
    public void testFindAverage() throws ArrayException {
        CalculationServiceImpl calculation = new CalculationServiceImpl();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        double actualAverage = calculation.findAverage(arr);
        double expectedAverage = 0.6;
        assertEquals(actualAverage, expectedAverage, 0.001, "Test failed as...");
    }

    @Test
    public void testCountPositiveElements() throws ArrayException {
        CalculationServiceImpl calculation = new CalculationServiceImpl();
        EntityArray arr = new EntityArray(-1, -2, -3, -4, -5);
        int actualNumber = calculation.countPositiveElements(arr);
        int expectedNumber = 0;
        assertEquals(actualNumber, expectedNumber, 0.001, "Test failed as...");
    }

    @Test
    public void testCountNegativeElements() throws ArrayException {
        CalculationServiceImpl calculation = new CalculationServiceImpl();
        EntityArray arr = new EntityArray(-1, -2, -3, -4, -5);
        int actualNumber = calculation.countNegativeElements(arr);
        int expectedNumber = 5;
        assertEquals(actualNumber, expectedNumber, 0.001, "Test failed as...");
    }
}
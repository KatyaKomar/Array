package test.by.komar.service;

import org.testng.annotations.Test;
import task.by.komar.entity.EntityArray;
import task.by.komar.exception.ArrayException;
import task.by.komar.service.ArraySearchService;

import static org.testng.Assert.*;

public class ArraySearchServiceTest {

    @Test
    public void testFindMin() throws ArrayException {
        ArraySearchService calculation = new ArraySearchService();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        int actualMin = calculation.findMin(arr);
        int expectedMin = -4;
        assertEquals(actualMin, expectedMin, 0.001, "Test failed as...");
    }

    @Test
    public void testFindMax() throws ArrayException {
        ArraySearchService calculation = new ArraySearchService();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        int actualMax = calculation.findMax(arr);
        int expectedMax = 5;
        assertEquals(actualMax, expectedMax, 0.001, "Test failed as...");
    }
}
package by.test.komar.service;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.service.impl.SearchStreamServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchStreamServiceImplTest {

    @Test
    public void testFindMin() throws ArrayException {
        SearchStreamServiceImpl calculation = new SearchStreamServiceImpl();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        int actualMin = calculation.findMin(arr);
        int expectedMin = -4;
        assertEquals(actualMin, expectedMin, 0.001, "Test failed as...");
    }

    @Test
    public void testFindMax() throws ArrayException {
        SearchStreamServiceImpl calculation = new SearchStreamServiceImpl();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        int actualMax = calculation.findMax(arr);
        int expectedMax = 5;
        assertEquals(actualMax, expectedMax, 0.001, "Test failed as...");
    }
}
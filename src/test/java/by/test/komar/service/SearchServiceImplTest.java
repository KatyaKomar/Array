package by.test.komar.service;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.service.impl.SearchServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SearchServiceImplTest {

    @Test
    public void testFindMin() throws ArrayException {
        SearchServiceImpl calculation = new SearchServiceImpl();
        EntityArray arr = new EntityArray(5, 4, 3, 2, 1);
        int actualMin = calculation.findMin(arr);
        int expectedMin = 1;
        assertEquals(actualMin, expectedMin, 0.001, "Test failed as...");
    }

    @Test
    public void testFindMax() throws ArrayException {
        SearchServiceImpl calculation = new SearchServiceImpl();
        EntityArray arr = new EntityArray(5, 5);
        int actualMax = calculation.findMax(arr);
        int expectedMax = 5;
        assertEquals(actualMax, expectedMax, 0.001, "Test failed as...");
    }
}
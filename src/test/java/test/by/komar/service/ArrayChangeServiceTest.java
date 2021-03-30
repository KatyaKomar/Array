package test.by.komar.service;

import org.testng.annotations.Test;
import task.by.komar.entity.EntityArray;
import task.by.komar.exception.ArrayException;
import task.by.komar.service.ArrayChangeService;

import static org.testng.Assert.*;

public class ArrayChangeServiceTest {

    @Test
    public void testChangePositiveElements() throws ArrayException {
        ArrayChangeService change = new ArrayChangeService();
        EntityArray actualArray = new EntityArray(1, -2, 3, -4, 5);
        change.changePositiveElements(actualArray);
        EntityArray expectedArray = new EntityArray(1, -2, 1, -4, 1);
        assertEquals(actualArray, expectedArray, "Test failed as...");
    }

    @Test
    public void testChangeNegativeElements() throws ArrayException {
        ArrayChangeService change = new ArrayChangeService();
        EntityArray actualArray = new EntityArray(1, -2, 3, -4, 5);
        change.changeNegativeElements(actualArray);
        EntityArray expectedArray = new EntityArray(1, -1, 3, -1, 5);
        assertEquals(actualArray, expectedArray, "Test failed as...");
    }
}
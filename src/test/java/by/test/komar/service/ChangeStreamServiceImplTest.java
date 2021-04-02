package by.test.komar.service;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.service.impl.ChangeStreamServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChangeStreamServiceImplTest {

    @Test
    public void testChangePositiveElements() throws ArrayException {
        ChangeStreamServiceImpl change = new ChangeStreamServiceImpl();
        EntityArray actualArray = new EntityArray(1, -2, 3, -4, 5);
        change.changePositiveElements(actualArray);
        EntityArray expectedArray = new EntityArray(1, -2, 1, -4, 1);
        assertEquals(actualArray, expectedArray, "Test failed as...");
    }

    @Test
    public void testChangeNegativeElements() throws ArrayException {
        ChangeStreamServiceImpl change = new ChangeStreamServiceImpl();
        EntityArray actualArray = new EntityArray(1, -2, 3, -4, 5);
        change.changeNegativeElements(actualArray);
        EntityArray expectedArray = new EntityArray(1, -1, 3, -1, 5);
        assertEquals(actualArray, expectedArray, "Test failed as...");
    }
}
package by.test.komar.service;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.service.impl.ChangeServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChangeServiceImplTest {

    @Test
    public void testChangePositiveElements() throws ArrayException {
        ChangeServiceImpl change = new ChangeServiceImpl();
        EntityArray actualArray = new EntityArray(1, 2, 3, 4, 5);
        change.changePositiveElements(actualArray);
        EntityArray expectedArray = new EntityArray(1, 1, 1, 1, 1);
        assertEquals(actualArray, expectedArray, "Test failed as...");
    }

    @Test
    public void testChangeNegativeElements() throws ArrayException {
        ChangeServiceImpl change = new ChangeServiceImpl();
        EntityArray actualArray = new EntityArray(1, 2, 3, 4, 5);
        change.changeNegativeElements(actualArray);
        EntityArray expectedArray = new EntityArray(1, 2, 3, 4, 5);
        assertEquals(actualArray, expectedArray, "Test failed as...");
    }
}
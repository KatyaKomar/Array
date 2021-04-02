package by.test.komar.service;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.service.ArraySortService;
import by.task.komar.service.impl.SortServiceImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortServiceImplTest {

    @Test
    public void testQuickSort() throws ArrayException {
        SortServiceImpl sort = new SortServiceImpl();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        EntityArray actualArr = sort.quickSort(arr);
        EntityArray expectedArr = new EntityArray(-4, -2, 1, 3, 5);
        assertEquals(actualArr, expectedArr, "Test failed as...");
    }

    @Test
    public void testCountingSort() throws ArrayException {
        SortServiceImpl sort = new SortServiceImpl();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        EntityArray actualArr = sort.countingSort(arr);
        EntityArray expectedArr = new EntityArray(-4, -2, 1, 3, 5);
        assertEquals(actualArr, expectedArr, "Test failed as...");
    }

    @Test
    public void testMergeSort() throws ArrayException {
        SortServiceImpl sort = new SortServiceImpl();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        EntityArray actualArr = sort.mergeSort(arr);
        EntityArray expectedArr = new EntityArray(-4, -2, 1, 3, 5);
        assertEquals(actualArr, expectedArr, "Test failed as...");
    }
}
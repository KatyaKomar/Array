package test.by.komar.service;

import org.testng.annotations.Test;
import task.by.komar.entity.EntityArray;
import task.by.komar.exception.ArrayException;
import task.by.komar.service.ArraySortService;

import static org.testng.Assert.*;

public class ArraySortServiceTest {

    @Test
    public void testQuickSort() throws ArrayException {
        ArraySortService sort = new ArraySortService();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        EntityArray actualArr = sort.quickSort(arr);
        EntityArray expectedArr = new EntityArray(-4, -2, 1, 3, 5);
        assertEquals(actualArr, expectedArr, "Test failed as...");
    }

    @Test
    public void testCountingSort() throws ArrayException {
        ArraySortService sort = new ArraySortService();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        EntityArray actualArr = sort.countingSort(arr);
        EntityArray expectedArr = new EntityArray(-4, -2, 1, 3, 5);
        assertEquals(actualArr, expectedArr, "Test failed as...");
    }

    @Test
    public void testMergeSort() throws ArrayException {
        ArraySortService sort = new ArraySortService();
        EntityArray arr = new EntityArray(1, -2, 3, -4, 5);
        EntityArray actualArr = sort.mergeSort(arr);
        EntityArray expectedArr = new EntityArray(-4, -2, 1, 3, 5);
        assertEquals(actualArr, expectedArr, "Test failed as...");
    }
}
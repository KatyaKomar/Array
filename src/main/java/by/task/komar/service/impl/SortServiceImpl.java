package by.task.komar.service.impl;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.service.ArraySortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class SortServiceImpl implements ArraySortService {
    private static Logger logger = LogManager.getLogger();

    private Random rand = new Random();

    @Override
    public EntityArray quickSort(EntityArray arrayEntity) throws ArrayException {
        EntityArray result;
        result = recursiveQuickSort(arrayEntity, 0, arrayEntity.size() - 1);
        logger.info("Quick sort finished. Sorted array is:" + result);
        return result;
    }

    @Override
    public EntityArray countingSort(EntityArray arrayEntity) throws ArrayException {
        EntityArray result = new EntityArray(arrayEntity.size());
        int maxElement = Integer.MAX_VALUE;
        SearchStreamServiceImpl searchService = new SearchStreamServiceImpl();
        int realMaxElement = searchService.findMax(arrayEntity);
        int realMinElement = searchService.findMin(arrayEntity);
        if (realMaxElement - realMinElement > maxElement) {
            logger.error("Elements are too large");
            throw new ArrayException("Elements are too large");
        }
        int[] countingArr = new int[realMaxElement - realMinElement + 1];
        for (int i = 0; i < arrayEntity.size(); i++) {
            countingArr[arrayEntity.getElement(i) - realMinElement]++;
        }
        int l = 0;
        for (int i = 0; i <= realMaxElement - realMinElement; i++) {
            for (int j = 0; j < countingArr[i]; j++) {
                result.setElement(i + realMinElement, l++);
            }
        }
        logger.info("Sorted array is:" + result);
        return result;
    }

    @Override
    public EntityArray mergeSort(EntityArray arrayEntity) throws ArrayException {
        EntityArray result = new EntityArray(arrayEntity.size());
        recursiveMergeSort(arrayEntity, result, 0, arrayEntity.size() - 1);
        logger.info("Merge sort finished. Sorted array is:" + result);
        return result;
    }

    private EntityArray recursiveQuickSort(EntityArray array, int currentL, int currentR) throws ArrayException {
        int l = currentL, r = currentR;
        int c = rand.nextInt(r - l);
        int median = array.getElement(l + c);
        while (l <= r) {
            while (array.getElement(l) < median) {
                l++;
            }
            while (array.getElement(r) > median) {
                r--;
            }
            if (l <= r) {
                int tmp = array.getElement(l);
                array.setElement(array.getElement(r), l);
                array.setElement(tmp, r);
                l++;
                r--;
            }
        }
        if (currentL < r) {
            recursiveQuickSort(array, currentL, r);
        }
        if (currentR > l) {
            recursiveQuickSort(array, l, currentR);
        }
        return array;
    }

    private void recursiveMergeSort(EntityArray array, EntityArray result, int l, int r) throws ArrayException {
        if (l > r) return;
        if (l == r) return;
        if (l + 1 == r) {
            if (array.getElement(l) > array.getElement(r)) {
                int tmp = array.getElement(l);
                array.setElement(array.getElement(r), l);
                array.setElement(tmp, r);
            }
            return;
        }
        int c = (r + l) / 2;

        recursiveMergeSort(array, result, l, c);
        recursiveMergeSort(array, result, c + 1, r);

        int ml = l;
        int l1 = l;
        int l2 = c + 1;

        while (l1 <= c || l2 <= r) {
            if (l1 <= c && l2 <= r) {
                if (array.getElement(l1) < array.getElement(l2)) {
                    result.setElement(array.getElement(l1++), ml++);
                } else {
                    result.setElement(array.getElement(l2++), ml++);
                }
            } else if (l1 <= c) {
                result.setElement(array.getElement(l1++), ml++);
            } else {
                result.setElement(array.getElement(l2++), ml++);
            }
        }
    }
}

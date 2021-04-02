package by.task.komar.service.impl;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.service.ArrayCalculationService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculationServiceImpl implements ArrayCalculationService {
    private static Logger logger = LogManager.getLogger();

    @Override
    public int sumOfArray(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            logger.log(Level.ERROR, "There are no elements in array");
            throw new ArrayException("There are no elements in array");
        }
        int sum = 0;
        for (int element : array.getEntityArray()) {
            sum += element;
        }
        logger.log(Level.INFO, "Sum of elements: " + sum);
        return sum;
    }

    @Override
    public double findAverage(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            logger.log(Level.ERROR, "There are no elements in array");
            throw new ArrayException("There are no elements in array");
        }
        double average = 1.0 * sumOfArray(array) / array.size();
        logger.log(Level.INFO, "Average of Array: " + average);
        return average;
    }

    @Override
    public int countPositiveElements(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            logger.log(Level.ERROR, "There are no elements in array");
            throw new ArrayException("There are no elements in array");
        }
        int count = 0;
        for (int element : array.getEntityArray()) {
            if (element > 0) {
                count++;
            }
        }
        logger.log(Level.INFO, "Number of positive elements: " + count);
        return count;
    }

    @Override
    public int countNegativeElements(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            logger.log(Level.ERROR, "There are no elements in array");
            throw new ArrayException("There are no elements in array");
        }
        int count = 0;
        for (int element : array.getEntityArray()) {
            if (element < 0) {
                count++;
            }
        }
        logger.log(Level.INFO, "Number of negative elements: " + count);
        return count;
    }
}

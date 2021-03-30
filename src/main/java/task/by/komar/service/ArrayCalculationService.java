package task.by.komar.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import task.by.komar.entity.EntityArray;
import task.by.komar.exception.ArrayException;

import java.util.Arrays;

public class ArrayCalculationService {


    private static Logger logger = LogManager.getLogger();

    public ArrayCalculationService() {
    }

    public int sumOfArray(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            throw new ArrayException("There is no elements in array");
        }
        logger.log(Level.INFO, "Min element: " + Arrays.stream(array.getEntityArray()).sum());
        return Arrays.stream(array.getEntityArray()).sum();
    }

    public double findAverage(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            throw new ArrayException("There is no elements in array");
        }
        logger.log(Level.INFO, "Min element: " + Arrays.stream(array.getEntityArray()).average().getAsDouble());
        return Arrays.stream(array.getEntityArray()).average().getAsDouble();
    }

    public int countPositiveElements(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            throw new ArrayException("There is no elements in array");
        }
        int count = (int) Arrays.stream(array.getEntityArray()).filter(i -> i > 0).count();
        logger.log(Level.INFO, "Number of positive elements: " + count);
        return count;
    }

    public int countNegativeElements(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            throw new ArrayException("There is no elements in array");
        }
        int count = (int) Arrays.stream(array.getEntityArray()).filter(i -> i < 0).count();
        logger.log(Level.INFO, "Number of negative elements: " + count);
        return count;
    }
}

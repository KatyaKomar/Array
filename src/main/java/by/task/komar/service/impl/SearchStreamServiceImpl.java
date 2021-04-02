package by.task.komar.service.impl;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.service.ArraySearchService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SearchStreamServiceImpl implements ArraySearchService {

    private static Logger logger = LogManager.getLogger();

    @Override
    public int findMin(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            logger.log(Level.ERROR, "There are no elements in array");
            throw new ArrayException("There are no elements in array");
        }
        int min = Arrays.stream(array.getEntityArray()).min().getAsInt();
        logger.log(Level.INFO, "Min element: " + min);
        return min;
    }

    @Override
    public int findMax(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            logger.log(Level.ERROR, "There are no elements in array");
            throw new ArrayException("There are no elements in array");
        }
        int max = Arrays.stream(array.getEntityArray()).max().getAsInt();
        logger.log(Level.INFO, "Max element: " + max);
        return max;
    }
}

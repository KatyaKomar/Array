package by.task.komar.service.impl;

import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.service.ArrayChangeService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ChangeStreamServiceImpl implements ArrayChangeService {
    private static Logger logger = LogManager.getLogger();

    @Override
    public void changePositiveElements(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            logger.log(Level.ERROR, "There are no elements in array");
            throw new ArrayException("There are no elements in array");
        }
        array.setEntityArray(Arrays.stream(array.getEntityArray()).map(i -> i > 0 ? 1 : i).toArray());
        logger.log(Level.INFO, "New array: " + array);
    }

    @Override
    public void changeNegativeElements(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            logger.log(Level.ERROR, "There are no elements in array");
            throw new ArrayException("There are no elements in array");
        }
        array.setEntityArray(Arrays.stream(array.getEntityArray()).map(i -> i < 0 ? -1 : i).toArray());
        logger.log(Level.INFO, "New array: " + array);
    }
}

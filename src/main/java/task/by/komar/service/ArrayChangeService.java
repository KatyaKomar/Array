package task.by.komar.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import task.by.komar.entity.EntityArray;
import task.by.komar.exception.ArrayException;

import java.util.Arrays;

public class ArrayChangeService {

    private static Logger logger = LogManager.getLogger();

    public ArrayChangeService() {
    }

    public void changePositiveElements(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            throw new ArrayException("There is no elements in array");
        }
        logger.log(Level.INFO, "New array: " + Arrays.stream(array.getEntityArray()).map(i -> i > 0 ? 1 : i).toArray());

        array.setEntityArray(Arrays.stream(array.getEntityArray()).map(i -> i > 0 ? 1 : i).toArray());
    }

    public void changeNegativeElements(EntityArray array) throws ArrayException {
        if (array.size() == 0) {
            throw new ArrayException("There is no elements in array");
        }
        logger.log(Level.INFO, "New array: " + Arrays.stream(array.getEntityArray()).map(i -> i < 0 ? -1 : i).toArray());
        array.setEntityArray(Arrays.stream(array.getEntityArray()).map(i -> i < 0 ? -1 : i).toArray());
    }
}

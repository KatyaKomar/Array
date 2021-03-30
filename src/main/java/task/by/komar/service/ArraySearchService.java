package task.by.komar.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import task.by.komar.entity.EntityArray;
import task.by.komar.exception.ArrayException;

import java.util.Arrays;

public class ArraySearchService {

    private static Logger logger = LogManager.getLogger();
    public ArraySearchService() {
    }


    public int findMin(EntityArray array) throws ArrayException {
        if(array.size()==0){
            throw new ArrayException("There is no elements in array");
        }
        logger.log(Level.INFO, "Min element: " + Arrays.stream(array.getEntityArray()).min().getAsInt());
        return Arrays.stream(array.getEntityArray()).min().getAsInt();
    }

    public int findMax(EntityArray array) throws ArrayException {
        if(array.size()==0){
            throw new ArrayException("There is no elements in array");
        }

        logger.log(Level.INFO, "Max element: " + Arrays.stream(array.getEntityArray()).max().getAsInt());
        return Arrays.stream(array.getEntityArray()).max().getAsInt();
    }
}

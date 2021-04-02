package by.task.komar.entity;

import by.task.komar.exception.ArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class EntityArray {

    private int[] array;
    private static Logger logger = LogManager.getLogger();

    public EntityArray(int size) throws ArrayException {
        if (size < 0) {
            logger.log(Level.ERROR, "Size cannot be " + size);
            throw new ArrayException("Size cannot be " + size);
        }
        array = new int[size];
    }

    public EntityArray(int... array) {
        this.array = array;
    }

    public int size() {
        return array.length;
    }

    public int[] getEntityArray() {
        return this.array.clone();
    }

    public int getElement(int position) throws ArrayException {
        if (position >= array.length || position < 0) {
            logger.log(Level.ERROR, position + " out of boarder");
            throw new ArrayException(position + " out of boarder");
        }
        return array[position];
    }

    public void setEntityArray(int[] array) {
        this.array = array;
    }

    public void setElement(int element, int position) throws ArrayException {
        if (position >= array.length || position < 0) {
            logger.log(Level.ERROR, position + " out of boarder");
            throw new ArrayException(position + " out of boarder");
        }
        this.array[position] = element;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[");
        for (int element : array) {
            string.append(element);
            string.append(", ");
        }
        if (string.length() > 1) {
            string.delete(string.length() - 2, string.length());
        }
        string.append("]");
        return string.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityArray entityArray = (EntityArray) o;
        return Arrays.equals(array, entityArray.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}

package task.by.komar.entity;

import task.by.komar.exception.ArrayException;

import java.util.Arrays;

public class EntityArray {

    private int[] array;

    EntityArray() {
    }

    public EntityArray(int size) {
        try {
            if (size < 0) {
                throw new ArrayException("Size is not natural");
            }
            array = new int[size];
        } catch (ArrayException e) {
            e.printStackTrace();
        }
    }

    public int size() {
        return array.length;
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

    public EntityArray(int... array) {
        this.array = array;
    }

    public int[] getEntityArray() {
        int[] copyArray = array;
        return copyArray;
    }

    public int getElement(int position) throws ArrayException {
        if (position >= array.length || position < 0) {
            throw new ArrayException("Out of boarder");
        }
        return array[position];
    }

    public void setEntityArray(int[] array) {
        this.array = array;
    }

    public void setElement(int a, int position) {
        try {
            if (position >= array.length || position < 0) {
                throw new ArrayException("Out of boarder");
            }
            this.array[position] = a;
        } catch (ArrayException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int element : array
        ) {
            str.append(Integer.toString(element));
            str.append(", ");
        }
        str.delete(str.length() - 2, str.length());
        str.append("]");
        return str.toString();
    }

}

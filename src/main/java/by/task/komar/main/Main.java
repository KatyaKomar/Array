package by.task.komar.main;


import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;
import by.task.komar.parser.ArrayParser;
import by.task.komar.reader.ArrayReader;

import java.io.FileNotFoundException;

public class Main {
    private static EntityArray readFromFile(String path) throws FileNotFoundException, ArrayException {
        ArrayReader reader = new ArrayReader();
        String str = reader.readFromFile(path);
        ArrayParser parser = new ArrayParser();
        EntityArray arr = parser.parse(str);
        return arr;
    }

    public static void main(String[] args) throws FileNotFoundException {
        try {
            System.out.println(readFromFile("C:\\Users\\User\\Downloads\\3 курс\\курсы\\array\\src\\main\\resources\\file\\file.txt"));
            System.out.println(readFromFile("C:\\Users\\User\\Downloads\\3 курс\\курсы\\array\\src\\main\\resources\\file\\file_1.txt"));
            System.out.println(readFromFile("C:\\Users\\User\\Downloads\\3 курс\\курсы\\array\\src\\main\\resources\\file\\file_2.txt"));
        } catch (ArrayException e) {
            System.out.println(e.getMessage());
        }
    }
}

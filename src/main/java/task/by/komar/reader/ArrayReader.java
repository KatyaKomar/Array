package task.by.komar.reader;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import task.by.komar.entity.EntityArray;
import task.by.komar.exception.ArrayException;
import task.by.komar.exception.ReaderException;
import task.by.komar.parser.ArrayParser;
import task.by.komar.validator.ArrayValidator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArrayReader {
    private static Logger logger = LogManager.getLogger();

    public ArrayReader() {
    }

    public EntityArray ReadFromFile(String path) throws ReaderException {
        try {
            FileReader reader = new FileReader(path);
            Scanner scan = new Scanner(reader);
            EntityArray arr = new EntityArray();
            ArrayParser parser = new ArrayParser();
            while (scan.hasNextLine()) {
                arr = parser.parse(scan.nextLine());
                if (arr != null) {
                    break;
                }
            }
            logger.log(Level.INFO, "Array from file is: " + arr);
            if (arr == null) {
                throw new ReaderException("There is no array in the file!");
            }
            return arr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
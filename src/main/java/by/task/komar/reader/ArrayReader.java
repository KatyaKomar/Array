package by.task.komar.reader;

import by.task.komar.validator.ArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.task.komar.exception.ArrayException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ArrayReader {
    private static Logger logger = LogManager.getLogger();

    public ArrayReader() {
    }

    public String readFromFile(String path) throws ArrayException, FileNotFoundException {
        FileReader reader = new FileReader(path);
        Scanner scan = new Scanner(reader);
        ArrayValidator validator = new ArrayValidator();
        while (scan.hasNextLine()) {
            String string = scan.nextLine();
            if (validator.isValidate(string)) {
                return string;
            }
        }
        logger.log(Level.ERROR, "There is no correct line in the file!");
        throw new ArrayException("There is no correct line in the file!");
    }
}
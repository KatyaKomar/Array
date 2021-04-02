package by.task.komar.parser;

import by.task.komar.validator.ArrayValidator;
import by.task.komar.entity.EntityArray;
import by.task.komar.exception.ArrayException;


public class ArrayParser {
    public EntityArray parse(String str) throws ArrayException {
        ArrayValidator validator = new ArrayValidator();
        if (validator.isValidate(str)) {
            final String space = "\\s+";
            int size = str.split(space).length;
            EntityArray array = new EntityArray(size);
            int i = 0;
            for (String element : str.split(space)) {
                array.setElement(Integer.parseInt(element), i++);
            }
            return array;
        } else {
            throw new ArrayException("This line is not correct");
        }
    }
}

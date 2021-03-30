package task.by.komar.parser;

import task.by.komar.entity.EntityArray;
import task.by.komar.validator.ArrayValidator;


public class ArrayParser {
    public EntityArray parse(String str) {
        ArrayValidator validator = new ArrayValidator();
        if (validator.validate(str)) {
            EntityArray array = new EntityArray(str.split(" ").length);
            int i = 0;
            for (String elem : str.split(" ")) {
                array.setElement(Integer.parseInt(elem), i++);
            }
            return array;
        }
        return null;
    }
}

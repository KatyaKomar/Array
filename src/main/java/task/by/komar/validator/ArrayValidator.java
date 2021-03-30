package task.by.komar.validator;

import java.util.regex.Pattern;

public class ArrayValidator {
    public boolean validate(String str) {
        Pattern p = Pattern.compile("^-?[0-9]+(\\s-?[0-9]+)*$");
        return p.matcher(str).find();
    }
}

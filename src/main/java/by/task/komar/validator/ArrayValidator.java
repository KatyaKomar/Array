package by.task.komar.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayValidator {
    public boolean isValidate(String str) {
        final String regularString = "^-?[0-9]+(\\s-?[0-9]+)*$";
        Pattern pattern = Pattern.compile(regularString);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}

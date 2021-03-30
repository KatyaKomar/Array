package test.by.komar.reader;

import org.testng.annotations.Test;
import task.by.komar.entity.EntityArray;
import task.by.komar.exception.ArrayException;
import task.by.komar.reader.ArrayReader;

import java.io.IOException;

public class ArrayReaderTest {

    @Test
    public void testReadFromFile() throws IOException, ArrayException {
        EntityArray arr = new EntityArray();
        ArrayReader reader = new ArrayReader();
        reader.ReadFromFile("C:\\Users\\User\\Downloads\\3 курс\\курсы\\array\\src\\main\\resources\\file\\file.txt");
    }
}
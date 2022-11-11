package lab2;

import static org.testng.Assert.assertEquals;

import lab2.entities.Person;
import lab2.entities.Residence;
import lab2.serialize.Serialize;
import lab2.serialize.SerializeToJSON;
import lab2.serialize.SerializeToTxt;
import lab2.serialize.SerializeToXml;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Lab2Test {
    @Test(dataProvider = "serializeToJSONTest")
    public void serializeProviderTest(String fileName, Serialize<Person> serializer, List<Person> objs) throws IOException, ClassNotFoundException {
        serializer.writeToFile(objs, fileName);
        List<Person> res = serializer.readFromFile(fileName);
        assertEquals(res, objs);
    }

    @DataProvider
    public Object[][] serializeToJSONTest() {
        List<Person> list = Arrays.asList
                (
                        new Person("Serg", "Mazurok", 19, new Residence("Ukraine", "Chernivtsi", "Golovna 165")),
                        new Person("Bogdan", "Mazurok", 16, new Residence("Ukraine", "Kyiv", "Pushkina 123"))
                );
        return new Object[][]
                {
                        {"test123.json", new SerializeToJSON(), list},
                        {"test1234.xml", new SerializeToXml(), list},
                        {"test1235.txt", new SerializeToTxt(), list}
                };
    }
}

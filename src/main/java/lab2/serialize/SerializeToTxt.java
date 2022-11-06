package lab2.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lab2.entities.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SerializeToTxt<T> implements Serialize<T> {
    @Override
    public void writeToFile(List<T> objs, String fileName) throws IOException
    {
        CsvMapper mapper = new CsvMapper();
        mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN,true);
        CsvSchema schema = mapper.schemaFor(Person.class);
        ObjectWriter writer = mapper.writerFor(Person.class).with(schema);
        writer.writeValues(new File(fileName)).writeAll(objs);
    }

    @Override
    public List<T> readFromFile(String fileName) throws IOException
    {
        CsvMapper mapper = new CsvMapper();
        return mapper.readValue(new File(fileName), new TypeReference<List<T>>() {});
    }
}

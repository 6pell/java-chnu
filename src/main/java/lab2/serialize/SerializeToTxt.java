package lab2.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
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
        mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN,true);
        CsvSchema schema = mapper.schemaFor(Person.class);
        ObjectReader reader = mapper.readerFor(Person.class).with(schema);
        return (List<T>) reader.readValues(new File(fileName)).readAll();
        /*MappingIterator<T> personIter = new CsvMapper().readerWithTypedSchemaFor(Person.class).readValues(fileName);
        return personIter.readAll();*/
        /*CsvMapper mapper = new CsvMapper();

        mapper.enable(CsvParser.Feature.TRIM_SPACES);
        mapper.enable(CsvParser.Feature.ALLOW_TRAILING_COMMA);
        mapper.enable(CsvParser.Feature.INSERT_NULLS_FOR_MISSING_COLUMNS);
        mapper.enable(CsvParser.Feature.SKIP_EMPTY_LINES);
        CsvSchema schema = mapper.schemaFor(Person.class).withColumnSeparator(',');
        ObjectReader reader;

        reader = mapper.readerFor(Person.class).with(schema);
        return reader.<T>readValues(new File(fileName)).readAll();*/
        /*CsvSchema schema = CsvSchema.builder().setColumnSeparator(',').setUseHeader(false).build();
        CsvMapper mapper = new CsvMapper();
        return (List<T>) mapper.reader(schema).forType(new TypeReference<List<T>>() {}).readValues(new File(fileName)).readAll();*/
    }
}

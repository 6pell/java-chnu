package lab2.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import lab1.devices.Device;
import lab1.devices.PlayStation;

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
        /*CsvSchema schema = mapper.schemaFor(Device.class);*/
        CsvSchema schema = CsvSchema.builder()
                .addColumn("ram.mark")
                .addColumn("ram.memorySize")
                .addColumn("ram.memoryFrequency")
                .addColumn("ram.started")
                .addColumn("type")
                .build();
        ObjectWriter writer = mapper.writerFor(PlayStation.class).with(schema);
        writer.writeValues(new File(fileName)).writeAll(objs);
    }

    @Override
    public List<T> readFromFile(String fileName) throws IOException, ClassNotFoundException {
        List<T>objs = new ArrayList<>();
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);
        Scanner inputFile = new Scanner(new FileReader(fileName));
        while (inputFile.hasNext())
        {
            objs.add((T)in.readObject());
        }
        return objs;
    }
}

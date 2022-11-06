package lab2.serialize;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SerializeToJSON<T> implements Serialize<T> {
    @Override
    public void writeToFile(List<T> objs, String fileName) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName),objs);
    }

    @Override
    public List<T> readFromFile(String fileName) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        List<T> res = mapper.readValue(new File(fileName), new TypeReference<List<T>>(){});
        return res;
    }
}

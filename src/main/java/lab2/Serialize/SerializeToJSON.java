package lab2.Serialize;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lab2.devices.Device;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SerializeToJSON<T> implements Serialize<T> {

    @Override
    public void listToFile(List<T> objs, String name) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(name),objs);
    }
    @Override
    public void objToFile(T obj, String name) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(name),obj);
    }
    @Override
    public List<T> listFromFile(String name) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        List<T> res = mapper.readValue(name, new TypeReference<>() {});
        System.out.println(res);
        return res;
    }
    @Override
    public T objFromFile(String name) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        T res = mapper.readValue(name, new TypeReference<T>() {});
        System.out.println(res);
        return res;
    }
}

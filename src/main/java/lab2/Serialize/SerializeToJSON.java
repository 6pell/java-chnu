package lab2.Serialize;

import java.io.File;
import java.util.List;

public class SerializeToJSON<T> implements Serialize<T> {

    @Override
    public void listToFile(List<T> objs, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(String.join(".",fileName,"json")), entity);
    }
    @Override
    public void objToFile(T obj, String filePath) {

    }
    @Override
    public List<T> listFromFile(String filePath) {
        return null;
    }
    @Override
    public T objFromFile(String filePath) {
        return null;
    }
}

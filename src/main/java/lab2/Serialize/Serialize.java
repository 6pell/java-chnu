package lab2.Serialize;

import java.io.IOException;
import java.util.List;

public interface Serialize<T>
{
    void listToFile(List<T> objs,String name) throws IOException;
    void objToFile(T obj,String name) throws IOException;
    List<T> listFromFile(String name)throws IOException;
    T objFromFile(String name)throws IOException;
}

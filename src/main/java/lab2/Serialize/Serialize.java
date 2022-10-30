package lab2.Serialize;

import java.util.List;

public interface Serialize<T>
{
    void listToFile(List<T> objs,String filePath);
    void objToFile(T obj,String filePath);
    List<T> listFromFile(String filePath);
    T objFromFile(String filePath);
}

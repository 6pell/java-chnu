package lab3;

import lab2.entities.Residence;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Person> personArrayList = new TreeSet<>();
        Person obj1 = new Person("Oleg","Demon",18, new Residence("Ukraine","Chernivtsi","Golovna 167"));
        Person obj2 = new Person("Serge","Mazurka",19, new Residence("Ukraine","Chernivtsi","Synogoge 322"));
        Person obj3 = new Person("Bogdan","Mazurka",21, new Residence("Ukraine","Chernivtsi","Kyivska 12"));
        personArrayList.add(obj1);
        personArrayList.add(obj2);
        personArrayList.add(obj3);
        for(Person p : personArrayList)
        {
            System.out.println(p);
        }
    }
}

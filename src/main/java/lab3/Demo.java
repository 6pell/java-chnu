package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Person> person1ArrayList = new TreeSet<>();
        Person obj1 = new Person("Oleg","Demon",18, new Residence("Ukraine","Chernivtsi","Golovna 167"));
        Person obj2 = new Person("Serge","Mazurka",25, new Residence("Ukraine","Chernivtsi","Synogoge 322"));
        Person obj3 = new Person("Bogdan","Mazurka",21, new Residence("Ukraine","Chernivtsi","Kyivska 12"));
        person1ArrayList.add(obj1);
        person1ArrayList.add(obj2);
        person1ArrayList.add(obj3);
        for(Person p : person1ArrayList)
        {
            System.out.println(p);
        }
        System.out.println("\n");


        ArrayList<PersonComparator> person2ArrayList = new ArrayList<>();
        PersonComparator obj4 = new PersonComparator("Panda","Demon",26, new Residence("Ukraine","Chernivtsi","Golovna 167"));
        PersonComparator obj5 = new PersonComparator("Dima","Gomega",19, new Residence("Ukraine","Chernivtsi","Synogoge 322"));
        PersonComparator obj6 = new PersonComparator("Matvey","Mular",20, new Residence("Ukraine","Chernivtsi","Kyivska 12"));
        person2ArrayList.add(obj4);
        person2ArrayList.add(obj5);
        person2ArrayList.add(obj6);
        Comparator ageComparator = new PersonComparator();
        Collections.sort(person2ArrayList,ageComparator);
        for(PersonComparator p : person2ArrayList)
        {
            System.out.println(p);
        }
    }
}

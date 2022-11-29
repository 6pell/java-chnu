package lab3;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Person> person1 = new TreeSet<>();
        Person obj1 = new Person("Oleg","Demon",18, new Residence("Ukraine","Chernivtsi","Golovna 167"));
        Person obj2 = new Person("Serge","Mazurka",25, new Residence("Ukraine","Chernivtsi","Synogoge 322"));
        Person obj3 = new Person("Bogdan","Mazurka",21, new Residence("Ukraine","Chernivtsi","Kyivska 12"));
        person1.add(obj1);
        person1.add(obj2);
        person1.add(obj3);
        for(Person p : person1)
        {
            System.out.println(p);
        }
        System.out.println("\n");


        List<Person> person2 = new ArrayList<>();
        Person obj4 = new Person("Panda","D",26, new Residence("Ukraine","Chernivtsi","Golovna 167"));
        Person obj5 = new Person("Dima","B",19, new Residence("Ukraine","Chernivtsi","Synogoge 322"));
        Person obj6 = new Person("Matvey","A",20, new Residence("Ukraine","Chernivtsi","Kyivska 12"));
        person2.add(obj4);
        person2.add(obj5);
        person2.add(obj6);
        Comparator surnameComparator = new PersonSurnameComparator();
        Collections.sort(person2,surnameComparator);
        for(Person p : person2)
        {
            System.out.println(p);
        }
        System.out.println("\n");

        List<Person> person3 = new ArrayList<>();
        Person obj7 = new Person("Max","Proskurnyak",26, new Residence("Ukraine","Chernivtsi","Golovna 167"));
        Person obj8 = new Person("Vlad","Martin",19, new Residence("Ukraine","Chernivtsi","Synogoge 322"));
        Person obj9 = new Person("Sanya","Kolts",20, new Residence("Ukraine","Chernivtsi","Kyivska 12"));
        person3.add(obj7);
        person3.add(obj8);
        person3.add(obj9);
        person3.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);

        System.out.println("\n");

        List<Person> person4 = new ArrayList<>();
        Person obj10 = new Person("a" , "z", 11, new Residence("Ukraine","Chernivtsi","Golovna 167"));
        Person obj11 = new Person("a" , "b", 11, new Residence("Ukraine","Chernivtsi","Golovna 167"));
        Person obj12 = new Person("a" , "c", 11, new Residence("Ukraine","Chernivtsi","Golovna 167"));
        person4.add(obj10);
        person4.add(obj11);
        person4.add(obj12);
        Comparator<Person> sortByAge = Comparator.comparing(Person::getAge);
        Comparator<Person> sortByFirstName = Comparator.comparing(Person::getFirstName);
        Comparator<Person> sortByLastName = Comparator.comparing(Person::getSecondName);
        List<Comparator<Person>> comparators = new ArrayList<>();
        comparators.add(sortByAge);
        comparators.add(sortByFirstName);
        comparators.add(sortByLastName);
        person4.sort(new ChainComparator(comparators));
        for(Person p : person4)
        {
            System.out.println(p);
        }
    }
}

package ru.safin.homework22;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonSuperComparator implements Comparator<Person> {

    public static void main(String[] args) {
        Comparator<Person> personComparator =
                new PersonByName().thenComparing(new PersonByAge());
        TreeSet<Person> people = new TreeSet<>(personComparator);
        people.add(new Person("Александр", 30));
        people.add(new Person("Александр", 20));
        people.add(new Person("Виктор", 25));
        people.add(new Person("Виктор", 35));
        people.add(new Person("Борис", 28));
        people.add(new Person("Борис", 20));

        for (Person p : people) {
            System.out.println(p.toString());
        }
    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}


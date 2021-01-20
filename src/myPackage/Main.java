package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person(2, "A", 2));
        list.add(new Person(1, "A", 1));
        list.add(new Person(3, "B", 5));
        list.add(new Person(5, "C", 5));
        list.add(new Person(4, "D", 4));

        list.forEach(person -> {
            System.out.println("Age: " + person.getAge() + " Id: " + person.getId() + " Name: " + person.getName());
        });

        System.out.println("---");

        // Java 8 Comparator de sap xep theo nhieu thuoc tinh;

        list.sort((person1, person2) -> {
            if (person1.getName().compareTo(person2.getName()) > 0) {
                return 1;
            } else if (person1.getName().compareTo(person2.getName()) < 0) {
                return -1;
            } else {
                if (person1.getId() - person2.getId() > 0) {
                    return 1;
                } else if (person1.getId() - person2.getId() < 0) {
                    return -1;
                } else {
                    if (person1.getAge() - person2.getAge() > 0) {
                        return 1;
                    } else if (person1.getAge() - person2.getAge() < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        list.forEach(person -> {
            System.out.println( "Name: " + person.getName() +" Id: " + person.getId() + " Age: " + person.getAge());
        });
    }
}

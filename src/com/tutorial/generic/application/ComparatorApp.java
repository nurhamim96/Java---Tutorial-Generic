package com.tutorial.generic.application;

import com.tutorial.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

// Note : Comparator digunakan jika kita menggunakan Object class punya orang lain kita tidak bisa merubahnya || class nya tidak bisa diubah lagi dan misalkan tidak implement Compareble

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Ibad", "Indonesia"),
                new Person("Eko", "Indonesia"),
                new Person("Budi", "Indonesia")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}

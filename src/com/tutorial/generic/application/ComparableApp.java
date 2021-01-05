package com.tutorial.generic.application;

import com.tutorial.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Ibad", "Indonesia"),
                new Person("Eko", "Indonesia"),
                new Person("Budi", "Indonesia")
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}

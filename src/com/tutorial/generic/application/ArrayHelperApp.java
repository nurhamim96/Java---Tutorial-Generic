package com.tutorial.generic.application;

import com.tutorial.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Ibad", "Nurhamim"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(ArrayHelper.<String>count(names)); // <String> sifatnya opsional
        System.out.println(ArrayHelper.count(numbers));
    }
}

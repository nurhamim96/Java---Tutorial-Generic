package com.tutorial.generic.application;

import com.tutorial.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(1000));
        print(new MyData<String>("Ibad"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}

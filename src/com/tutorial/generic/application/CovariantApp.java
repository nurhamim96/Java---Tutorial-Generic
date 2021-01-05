package com.tutorial.generic.application;

import com.tutorial.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Ibad");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());
//        myData.setData(1); // tidak boleh, karena berbahaya
    }
}

// Note : Covariant bisa digunakan untuk get Data dari subtitusi child ke parent

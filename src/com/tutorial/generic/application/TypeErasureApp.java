package com.tutorial.generic.application;

import com.tutorial.generic.MyData;

/* MATERI TYPE ERASURE -> Menghilangkan tipe data generic misal : MyData<String> myData = new MyData("Ibad"); Menjadi MyData myData = new MyData("Ibad"); */
public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("Ibad");

        // ERROR -> tidak bisa di casting dari tipe data String ke Integer
//        MyData<Integer> integerMyData = (MyData<Integer>) myData;
//        Integer integer = integerMyData.getData();
    }
}

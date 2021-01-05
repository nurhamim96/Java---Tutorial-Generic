package com.tutorial.generic.application;

import com.tutorial.generic.MyData;

import java.util.Objects;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Ibad");
//        objectMyData.setData(1000); // kalo menggunakan tipe data Object datanya bisa di set apapun misal : dari String ke Integer dan itu tidak boleh
        MyData<? super String> myData = objectMyData;

        process(objectMyData);
        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        Object value = myData.getData(); // tidak disarankan karena yang di gunakan parameter Object jadi bisa diubah" tipe datanya.
        System.out.println("Process parameter " + value);
        myData.setData("Ibad Nurhamim");
    }
}

// Note : Contravariant walaupun aman di setDatanya tapi tidak aman di getDatanya
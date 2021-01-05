package com.tutorial.generic.application;

/* MATERI MULTIPLE BOUNDED TYPE PARAMETER */

public class MultipleConstraintApp {
    public static void main(String[] args) {
//        Data<Manager> managerData = new Data<>(new Manager()); ERROR -> Manager tidak implement CanSayHello
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee {

    }

    public static class VicePresident extends Employee implements CanSayHello{

        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    // Note : hanya bisa extends 1 parent class bisa pake & asalkan extends Interface
    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}

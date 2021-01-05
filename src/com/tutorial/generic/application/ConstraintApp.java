package com.tutorial.generic.application;

/*  MATERI BOUNDED TYPE PARAMETER */

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(1L);
//        NumberData<String> stringNumberData = new NumberData<String>("Ibad"); // tidak bisa karena di set generic type nya hanya bisa yang bertipe data Number aja
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
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

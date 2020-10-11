package com.imooc;

public class zi extends Abact {
    public static void main(String[] args) {
        Integer num_1 = 100;
        Integer num_2 = 100;
        System.out.println(num_1.equals(num_2)); //true
        System.out.println(num_1 == num_2); //true
        Integer num_3 = 128;
        Integer num_4 = 128;
        System.out.println(num_3.equals(num_4)); //true
        System.out.println(num_3 == num_4); //false
    }
}

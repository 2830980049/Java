package com.test;

public class Test1 {
    static int i = 12;

    public Test1() {
        i = 4;
    }

    public Test1(int j) {
        i = j;
    }

    public static void main(String[] args) {
        Test1 t = new Test1(5);
        Test1 tt = new Test1();
        System.out.println(t.i);
        System.out.println(tt.i);
    }

}

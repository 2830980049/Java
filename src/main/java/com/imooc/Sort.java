package com.imooc;
public class Sort implements Comparable<Sort>{
    private int a;
    public Sort() {
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public Sort(int a) {
        this.a = a;
    }
    public int compareTo(Sort sort) {
        return  a - sort.getA();
    }
}

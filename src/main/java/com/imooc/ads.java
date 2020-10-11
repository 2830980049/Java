package com.imooc;

public interface ads {
    int s = 1;
    default void walk(){
        System.out.println("IWalk walk");
    }
    static void sss(){
        System.out.println("asda");
    }
    void cls();
}

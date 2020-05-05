package com.imooc.Thread;
public class SingleHungry {
    private static SingleHungry instance = new SingleHungry();
    private SingleHungry(){}
    public static SingleHungry getInstance(){
        return instance;
    }
}

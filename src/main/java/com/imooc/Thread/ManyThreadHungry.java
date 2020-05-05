package com.imooc.Thread;
public class ManyThreadHungry extends Thread{
    @Override
    public void run() {
        System.out.println(SingleHungry.getInstance().hashCode());
    }
    public static void main(String[] args) {
        ManyThreadHungry[] mts = new ManyThreadHungry[10];
        for (int i = 0; i < mts.length; i++)
            mts[i] = new ManyThreadHungry();
        for (int i = 0; i < mts.length; i++)
            mts[i].start();
    }
}

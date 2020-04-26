package com.imooc.Thread;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName()+"该线程正在执行！");
    }
}

public class CreateThread_1 {

    public static void main(String[] args) {
        System.out.println("主线程1");
        MyThread mt = new MyThread();
        // 启动线程
        mt.start();
        //mt.start();
        System.out.println("主线程2");
    }



}

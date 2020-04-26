package com.imooc.Thread;

class MyThread2 extends Thread{
    public MyThread2(String name){
        super(name);
    }

    public void run(){
        for (int i = 1; i <= 10; i++)
            System.out.println(getName()+"正在运行" +i);
    }
}

public class CreateThread_2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2("线程1");
        MyThread2 myThread22 = new MyThread2("线程2");
        myThread2.start();
        myThread22.start();
    }


}

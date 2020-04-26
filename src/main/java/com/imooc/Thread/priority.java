package com.imooc.Thread;

class MyThead5 extends Thread{
    private String name;
    public MyThead5(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i =1;i<=50;i++)
            System.out.println("线程"+name+"正在运行"+i);
    }
}
public class priority {
    public static void main(String[] args) {
        //获得主线程优先级
        int mainpriority = Thread.currentThread().getPriority();
        System.out.println("主线程优先级："+mainpriority);
        MyThead5 myThead1 = new MyThead5("线程1");
        MyThead5 myThead2 = new MyThead5("线程2");
        myThead1.setPriority(Thread.MAX_PRIORITY);
        myThead2.setPriority(Thread.MIN_PRIORITY);
        myThead2.start();
        myThead1.start();
        System.out.println("线程1优先级："+myThead1.getPriority());
    }
}

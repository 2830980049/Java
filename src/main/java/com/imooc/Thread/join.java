package com.imooc.Thread;
class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 1;i <= 100; i++) {
            System.out.println(getName() + "正在执行" + i + "次");
        }
    }
}
public class join {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 mt = new MyThread3();
        mt.start();
        //该线程先执行
        mt.join(3);
        for (int i = 1;i <= 10; i++)
            System.out.println("主线程运行结束！"+i+"次");
    }
}

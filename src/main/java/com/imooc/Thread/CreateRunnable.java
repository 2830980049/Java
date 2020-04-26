package com.imooc.Thread;

class PrintRunnable implements Runnable{
    public void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println(Thread.currentThread().getName()+"正在运行"+i);
            try {
                //每隔一秒执行一次
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class CreateRunnable {
    public static void main(String[] args) {
        PrintRunnable pr = new PrintRunnable();
        Thread thread = new Thread(pr);
        thread.start();
        Thread thread2 = new Thread(pr);
        thread2.start();
    }
}

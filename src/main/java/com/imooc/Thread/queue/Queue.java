package com.imooc.Thread.queue;

public class Queue {
    private int n;
    boolean flag = false;
    public synchronized int getN() throws InterruptedException {
        if (!flag){
            wait();
        }
        System.out.println("消费："+n);
        //消费完毕，容器中没有数据
        flag = false;
        //唤醒所有线程
        notifyAll();
        return n;
    }

    public synchronized void setN(int n) throws InterruptedException {
        if (flag){
            wait();
        }
        System.out.println("生产："+n);
        this.n = n;
        //生产完毕，容器中有数据
        flag = true;
        //唤醒所有线程
        notifyAll();
    }


}

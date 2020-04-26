package com.imooc.Thread.queue;

public class Product implements Runnable{
    Queue queue;
    public Product(Queue queue) {
        this.queue = queue;
    }
    public void run() {
        int i = 0;
        while (true){
            try {
                queue.setN(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

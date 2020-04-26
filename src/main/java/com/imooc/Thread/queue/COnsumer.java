package com.imooc.Thread.queue;

public class COnsumer implements Runnable{
    Queue queue;
    public COnsumer(Queue queue) {
        this.queue = queue;
    }
    public void run() {
        while (true){
            try {
                queue.getN();
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

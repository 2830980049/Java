package com.imooc.Thread.queue;

public class Test1 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        new Thread(new Product(queue)).start();
        new Thread(new COnsumer(queue)).start();

    }
}

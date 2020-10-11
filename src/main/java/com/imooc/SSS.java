package com.imooc;

import java.util.Random;

public class SSS {
     static class Runner_1 extends Thread{
        @Override
        public void run() {
            Integer speed = new Random().nextInt(10) + 1;
            for (int i = 1; i <= 100; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName()+"已前进"+(i * speed)+"米");
            }
        }
    }
    public static void main(String[] args) {
        Runner_1 runner_1 = new Runner_1();
        runner_1.setName("苏苏");
        Runner_1 runner_2 = new Runner_1();
        runner_2.setName("苏酒儿");
        runner_1.start();
        runner_2.start();
    }
}

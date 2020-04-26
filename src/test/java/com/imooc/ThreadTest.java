package com.imooc;

class Letter implements Runnable{

    public void run() {
        for (int i = 0; i < 26;i++){
            char s = (char) (97 + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(s);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Letter letter = new Letter();
        Thread thread = new Thread(letter);
        thread.start();
    }

}

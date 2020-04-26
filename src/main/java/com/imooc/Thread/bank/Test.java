package com.imooc.Thread.bank;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank("1001",1000);
        SaveAccount saveAccount = new SaveAccount(bank);
        DrawAccount drawAccount = new DrawAccount(bank);
        Thread save = new Thread(saveAccount);
        Thread draw = new Thread(drawAccount);
        save.start();
        draw.start();
        save.join();
        draw.join();
        System.out.println(bank);
    }
}

package com.imooc.Thread.bank;

public class DrawAccount implements Runnable{
    Bank bank;
    public DrawAccount(Bank bank){
        this.bank = bank;
    }
    public void run() {
        try {
            bank.drawAccount();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

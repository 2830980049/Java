package com.imooc.Thread.bank;

public class SaveAccount implements Runnable{
    Bank bank;
    public SaveAccount(Bank bank){
        this.bank = bank;
    }
    public void run() {
        try {
            bank.saveAcount();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

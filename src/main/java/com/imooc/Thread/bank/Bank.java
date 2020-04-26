package com.imooc.Thread.bank;

public class Bank {
    private String account;
    private int balance;

    public Bank() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Bank(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "account='" + account + '\'' +
                ", balance=" + balance +
                '}';
    }

    public synchronized void saveAcount() throws InterruptedException {
        int balance = getBalance();
        Thread.sleep(1000);
        balance += 100;
        setBalance(balance);
        System.out.println("存款后余额："+balance);
    }

    public void drawAccount() throws InterruptedException {
        synchronized(this) {
            int balance = getBalance();
            balance -= 200;
            Thread.sleep(1000);
            setBalance(balance);
            System.out.println("取款后余额：" + balance);
        }
    }


}

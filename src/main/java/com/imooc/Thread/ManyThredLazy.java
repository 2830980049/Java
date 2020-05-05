package com.imooc.Thread;

public class ManyThredLazy extends Thread{
    @Override
    public void run() {
        try {
            System.out.println(SingleLazy.getInstance().hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ManyThredLazy[] mst = new ManyThredLazy[10];
        for (int i = 0; i < mst.length; i++)
            mst[i] = new ManyThredLazy();
        for (int i = 0; i < mst.length; i++)
            mst[i].start();
    }
}

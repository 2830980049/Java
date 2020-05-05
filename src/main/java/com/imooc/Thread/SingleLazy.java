package com.imooc.Thread;

public class SingleLazy {
    private static SingleLazy instance = null;
    private SingleLazy(){}
    public static SingleLazy getInstance() throws InterruptedException {
        if (instance == null) {
            Thread.sleep(300);
            instance = new SingleLazy();
        }
        return instance;
    }
}

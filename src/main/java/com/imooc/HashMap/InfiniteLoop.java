package com.imooc.HashMap;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @Author WuQiLi
 * @Date 2020/10/12 10:14
 * @Version 1.0
 */
public class InfiniteLoop {
    private static HashMap<Integer, String> map = new HashMap<Integer, String>(2, 0.75f);

    public static void main(String[] args) throws InterruptedException {
        map.put(5, "C");
        new Thread("Thread1") {
            @Override
            public void run() {
                map.put(7, "B");
                System.out.println(map);
            };
        }.start();
        new Thread("Thread2"){
            @Override
            public void run() {
                map.put(3, "A");
                System.out.println(map);
            }
        }.start();
    }
}

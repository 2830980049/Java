package com.edu.Abstract;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author WuQiLi
 * @Date 2020/10/23 14:19
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        AbstractFather abstractSon = new AbstractSon();
        ConcurrentHashMap<String,Object> concurrentHashMap = new ConcurrentHashMap<>(16);
        concurrentHashMap.put("age", 20);
        concurrentHashMap.put("height", 165);
        abstractSon.susu(concurrentHashMap);
    }
}

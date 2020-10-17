package com.imooc.HashMap.property;

import java.util.HashMap;

/**
 * @Author WuQiLi
 * @Date 2020/10/14 9:48
 * @Version 1.0
 */
public class Test {
    static void test(int mapSize){
        HashMap<Key, Integer> map = new HashMap<Key,Integer>(mapSize);
        for (int i = 0; i < mapSize; i++) {
            map.put(Keys.of(i), i);
        }
        //获取纳秒
        long beginTime = System.nanoTime();
        for (int i = 0; i < mapSize; i++){
            map.get(Keys.of(i));
        }
        long endTime = System.nanoTime();
        System.out.println("开始"+beginTime+"结束 "+endTime+"时间差 "+(endTime - beginTime));
    }

    public static void main(String[] args) {
        test(10);
        test(100);
        test(1000);
        test(10000);
    }
}

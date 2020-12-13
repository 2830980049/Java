package com.edu.Abstract;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author WuQiLi
 * @Date 2020/10/23 14:16
 * @Version 1.0
 */
public class AbstractSon extends AbstractFather{
    @Override
    public void susu(ConcurrentHashMap<String,Object> concurrentHashMap) {
        // 遍历值
        // for (Object o : concurrentHashMap.keySet())
        //   System.out.println(o);

        for (Map.Entry<String,Object> entry : concurrentHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

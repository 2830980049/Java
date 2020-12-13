package com.edu.Abstract;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author WuQiLi
 * @Date 2020/10/23 14:10
 * @Version 1.0
 */
public abstract class AbstractFather {
    private String params;

    private void myselfMethod(){
        System.out.println("私有方法");
    }
    public abstract void susu(ConcurrentHashMap<String,Object> concurrentHashMap);

    public String level(){
        return "苏苏 - 6666";
    }
}

package com.imooc.HashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author WuQiLi
 * @Date 2020/10/17 12:25
 * @Version 1.0
 */
public class LinkedHashMapMode {

    public static void main(String[] args) {
        // 插入排序
//        LinkedHashMap linkedHashMap = new LinkedHashMap();
//        linkedHashMap.put("name","苏苏");
//        linkedHashMap.put("sex",0);
//        linkedHashMap.put("age",20);
//        System.out.println(linkedHashMap);

        // 访问排序 设置 第三个参数为true  把get对应的值放到双向链表尾部
        LinkedHashMap linkedHashMap = new LinkedHashMap(16,0.75f,true);
        linkedHashMap.put("name","苏苏");
        linkedHashMap.put("sex",0);
        linkedHashMap.put("age",20);
        linkedHashMap.get("sex");
        Iterator<Map.Entry> iterator = linkedHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}

package com.imooc.HashMap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("苏苏",20);
        hashMap.put("苏酒儿",21);
        System.out.println(hashMap.get("苏酒儿"));
        hashMap.get("苏苏").hashCode();
        String s = "21";
        s.hashCode();
    }
}

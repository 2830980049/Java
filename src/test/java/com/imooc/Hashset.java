package com.imooc;

import com.imooc.Map.Goods;

import java.util.HashSet;
import java.util.Set;

public class Hashset {




    public static void main(String[] args) {
        Set<Goods> set = new HashSet<Goods>();
        set.add(new Goods("1234","666",12.0f));
        set.add(new Goods("1234","666",12.0f));
        System.out.println(set.size());
        for (Goods s:set){
            System.out.println(s.hashCode()+"   "+s.getName());
        }
    }
}

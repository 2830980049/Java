package com.imooc.List;
import java.util.*;

public class Lists{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(1);
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>(list);
        list.clear();
        list.addAll(hashSet);
        System.out.println(list);
    }
}

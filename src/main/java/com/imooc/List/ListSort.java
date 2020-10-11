package com.imooc.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<students> students = new ArrayList<students>();
        students.add(new students("苏苏",20,99.5));
        students.add(new students("艾萨",18,90.5));
        students.add(new students("苏酒儿",22,95.5));
        Collections.sort(students, new Comparator<com.imooc.List.students>() {
            @Override
            public int compare(com.imooc.List.students o1, com.imooc.List.students o2) {
                // 升序排序 o1 > o2
                return (int)(o1.getScore() - o2.getScore());
                // 降序排序
                // return (int)(o2.getScore() - o1.getScore());
            }
        });
        System.out.println(students);
    }
}

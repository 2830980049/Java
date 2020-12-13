package com.edu.Comparable;

import java.util.Arrays;

/**
 * @Author WuQiLi
 * @Date 2020/12/13 15:09
 * @Version 1.0
 */
public class Comparable_1 {
    public static void main(String[] args) {
        Students[] students = new Students[4];
        students[0] = new Students(6,"苏苏",20);
        students[1] = new Students(3,"苏酒儿",21);
        students[2] = new Students(1,"艾萨",18);
        students[3] = new Students(1,"雅雅",23);
        Arrays.sort(students);
        for (Students students1: students){
            System.out.println(students1);
        }
    }
}

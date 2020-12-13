package com.edu.Comparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author WuQiLi
 * @Date 2020/12/13 15:43
 * @Version 1.0
 */
public class Comparable_2 {
    public static void main(String[] args) {
        Student2[] students = new Student2[4];
        students[0] = new Student2(6,"苏苏",20);
        students[1] = new Student2(3,"苏酒儿",21);
        students[2] = new Student2(1,"艾萨",18);
        students[3] = new Student2(1,"雅雅",23);
        Arrays.sort(students, new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                if (o1 instanceof Student2 && o2 instanceof Student2){
                    Student2 student1 = (Student2)o1;
                    Student2 student2 = (Student2)o2;
                    if (student1.getId() > student2.getId()){
                        return 1;
                    }
                    else if (student1.getId() < student2.getId()){
                        return -1;
                    }
                    else if (student1.getAge() >= student2.getAge()){
                        return -1;
                    }
                    else {
                        return 1;
                    }
                }
                throw new RuntimeException("参数不一致");
            }
        });
        for (Student2 students1: students){
            System.out.println(students1);
        }
    }
}

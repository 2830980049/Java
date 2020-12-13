package com.edu.String;

import java.util.Arrays;

/**
 * @Author WuQiLi
 * @Date 2020/12/10 15:19
 * @Version 1.0
 */
public class string_1 {

    public static void main(String[] args) {
        String a = "asdasd";
        String c = "asdas";
        String b = a.replace('a','6');


        String d = a.intern();
        System.out.println(d == a);

        int num = a.compareTo(b);
        System.out.println(num);
        System.out.println(a.contains("dd"));

        System.out.println(a.replace("as","66"));
        char[] charArray = a.toCharArray();
        char[] arr = {'a','b','c'};

        String st = new String(arr);

        byte[] bytes = a.getBytes();
        System.out.println(Arrays.toString(bytes));
    }
}

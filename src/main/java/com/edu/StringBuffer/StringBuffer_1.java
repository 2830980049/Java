package com.edu.StringBuffer;

/**
 * @Author WuQiLi
 * @Date 2020/12/12 20:28
 * @Version 1.0
 */
public class StringBuffer_1 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("123456");
        System.out.println(stringBuilder.charAt(1));
        System.out.println(stringBuilder);
    }

}

package com.edu.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author WuQiLi
 * @Date 2020/12/13 11:30
 * @Version 1.0
 */
public class Date_1 {
    public static void main(String[] args) throws ParseException {
        long time = System.currentTimeMillis();
        System.out.println(time);
        Date date = new Date();
        System.out.println(date); //Sun Dec 13 11:35:37 CST 2020
        date.getTime(); // 获取当前毫秒数

        Date date1 = new Date(1607830537260L);
        System.out.println(date1);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String forDate = simpleDateFormat1.format(date);
        System.out.println(forDate);
        Date date2 = simpleDateFormat1.parse(forDate);
        System.out.println(date2);


    }
}

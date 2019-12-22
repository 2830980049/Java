package com.imooc.String;

import java.io.UnsupportedEncodingException;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/21 19:33
 */
public class StringDemo1 {
    public static void main(String[] sasda) throws UnsupportedEncodingException {

        String str = "JAVA 编程 基础的编程";
        //打印输出字符串长度
        System.out.println("字符串长度："+str.length());

        //取出字符'程'
        System.out.println(str.charAt(6));

        //取出字符"编程 基础"
        System.out.println(str.substring(5));

        ///取出字符"编程" 表示7以前的字符
        System.out.println(str.substring(5,7));

        //查找字符'A'在字符串中第一次出现的位置
        System.out.println("字符'A'在字符串中第一次出现的位置 "+str.indexOf('A'));

        //查找字符"编程"在字符串中第一次出现的位置
        System.out.println("字符\"编程\"在字符串中第一次出现的位置 "+str.indexOf("编程"));

        //查找字符'A'在字符串中最后一次出现的位置
        System.out.println("字符'A'在字符串中最后一次出现的位置 "+str.lastIndexOf('A'));

        //查找字符"编程"在字符串中最后一次出现的位置
        System.out.println("查找字符\"编程\"在字符串中最后一次出现的位置 "+str.lastIndexOf("编程"));

        //在字符串index值为8的位置开始，查找字符"编程"第一次出现的位置
        System.out.println("在字符串index值为8的位置开始，查找字符\"编程\"第一次出现的位置 "+str.indexOf("编程",8));

        //replace(charAt | String, String) 将指定字符或者字符串替换为指定字符或者字符串
        String s = "abcdefg";
        s = s.replace("cd","MM");
        System.out.println(s);
        System.out.println();

        //将字符串转化为byte数组，并打印输出
        byte[] ar = str.getBytes();
        for(int i = 0; i < ar.length; i++)
            System.out.print(ar[i]+" ");
        System.out.println();

        //将byte数组转化为字符串 并设置转换格式
        String str1 = new String(ar,"UTF-8");
        System.out.println(str1);
        System.out.println();

        //格式转化
        byte[] ar1 = str.getBytes("GBK");
        str1 = new String(ar1,"GBK");
        System.out.println(str1);
        System.out.println();

        //地址
        String str3 = "da";
        String str4 = "da";
        String str5 = new String("da");
        String str6 = new String("da");
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str5 == str6);
        System.out.println();

        //String的不可变性
        //String对象一旦被创建，则不能修改，是不可变的
        //所谓的修改其实是创建了新的对象，所指向的内存空间不变
        String st = "VN";
        String st1 = "666-"+st;
        st = "666-"+st;
        //st不在指向VN所在的内存空间，而是指向了"666-VN"
        System.out.println(st);
        System.out.println(st1);
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder("VN");
        //在"VN"后面添加内容
        stringBuilder.append('-');
        stringBuilder.append("uzi666");
        System.out.println(stringBuilder);

        //将字符变成"VN-UZI"

        //1. 使用delete方法删除uzi,然后插入UZI insert offset表示从第几个字符开始
        System.out.println("替换后："+stringBuilder.delete(3,6).insert(3,"UZI"));
        System.out.println();
        //2. 使用replace方法直接替换
        System.out.println("替换后："+stringBuilder.replace(3,6,"UZI"));
        System.out.println();
        //在字符串取出"UZ"
        System.out.println(stringBuilder.substring(3,5));

    }
}

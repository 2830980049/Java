package com.imooc.BaoZhuang_Class;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/16 20:44
 */
public class TestOne {
    public static void main(String[] s1231) {
        //装箱：把基本数据类型转化为包装类
        //1. 自动装箱
        int t = 2;
        Integer t1 = t;
        System.out.println(t1);

        //2. 手动装箱
        Integer t2 = new Integer(t1);
        System.out.println(t2);

        //3. 拆箱：把包装类转化为基本数据类型

        //1. 自动拆箱
        int t3 = t1;
        System.out.println("自动拆箱后，int类型变量 t3 = "+t3);
        //2. 手动拆箱
        int t4 = t1.intValue();         //转化为int类型
        double t5 = t1.doubleValue();   //转化为double类型
        System.out.println("手动拆箱后，int类型变量 t4 = "+t4);
        System.out.println("手动拆箱后，double类型变量 t4 = "+t5);

        //基本数据类型转换为字符串
        int s = 2;
        String s1 = Integer.toString(s);
        System.out.println("int 转 String s1 = "+s1);

        //字符串转化为基本数据类型
        // 1.包装类parse
        int s2 = Integer.parseInt(s1);
        System.out.println("String 转 int s2 = "+s2);

        // 2.包装类valueOf 先将字符串转换为包装类，再通过自动拆箱完成基本数据类型转化
        int s3 = Integer.valueOf(s1);
        System.out.println("String 转 int s3 = "+s3);
       
    }

}

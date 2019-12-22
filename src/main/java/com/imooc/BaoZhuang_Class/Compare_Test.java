package com.imooc.BaoZhuang_Class;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/16 23:02
 */
public class Compare_Test {
    public static void main(String[] sasda){
        Integer one = new Integer(100);
        Integer two = new Integer(100);
        System.out.println("one == two 结果："+(one == two));

        Integer three = 100;
        System.out.println("three == 100 结果："+(three == 100));

        Integer four = 100; //等价于 Integer.valueOf(100)
        //valueOf 对象池里可以缓存 -128 - 127范围里的数 否则会重新 new 一个
        System.out.println("three == four结果："+(three == four));

        Integer five = 200;
        System.out.println("five == 200 结果："+(five == 200));

        Integer six = 200;
        System.out.println("five == six 结果："+(five == six));

        Double d1 = Double.valueOf(100.0);
        Double d2 = Double.valueOf(100.0);
        System.out.println("d1 = d2 结果： "+(d1 == d2));

        Float f1 = Float.valueOf(100.0f);
        Float f2 = Float.valueOf(100.0f);
        System.out.println("f1 = f2 结果： "+(f1 == f2));




    }
}

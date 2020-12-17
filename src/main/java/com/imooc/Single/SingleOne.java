package com.imooc.Single;


/**
 * 饿汉式: 创建对象实例的时候直接初始化
 * @author asus
 */
public class SingleOne {

    private static String code = "UTF-8";

    /**1.创建类中的私有构造*/
    private SingleOne() {}

    /**2.创建该类型的私有静态实例*/
    private static SingleOne instance = new SingleOne();

    /**3.创建公有静态方法返回静态实例对象*/
    public static SingleOne getInstance() {
        return instance;
    }

    public void single(){
        System.out.println("单例模式");
    }
}

package com.imooc.Single;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/13 15:35
 */

// 饿汉式: 创建对象实例的时候直接初始化
public class SingleOne {
    // 1.创建类中的私有构造
    private SingleOne() {

    }

    // 2.创建该类型的私有静态实例
    private static SingleOne instance = new SingleOne();

    // 3.创建公有静态方法返回静态实例对象
    public static SingleOne getInstance() {
        return instance;
    }
}

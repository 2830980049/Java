package com.imooc.Single;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/13 15:36
 */

// 懒汉式子: 类内实例对象创建时并不直接初始化，直到第一次才
// 用时间换空间

public class SingleTwo {

    // 1. 创建私有构造方法
    private SingleTwo() {

    }

    // 2.创建静态的该类实例对象
    private static SingleTwo instance = null;

    // 3.创建开放静态方法提供实例对象
    public static SingleTwo getInstance() {
        if(instance == null)
            instance = new SingleTwo();
        return instance;
    }
}

package com.imooc.Tel;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/14 15:35
 */
public interface IFather {
    void say();

    default void connection(){
        System.out.println("IFather中的connection");
    }
}

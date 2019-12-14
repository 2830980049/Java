package com.imooc.Tel;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/14 15:38
 */
public interface IFather2 {
    void fly();

    default void connection(){
        System.out.println("IFather2中的connection");
    }
}

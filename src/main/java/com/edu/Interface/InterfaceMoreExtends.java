package com.edu.Interface;

/**
 * @Author WuQiLi
 * @Date 2020/10/25 17:57
 * @Version 1.0
 */

/**
 *  接口多重继承
 * @author WQL
 */
public interface InterfaceMoreExtends extends AInterface,BInterface{
    @Override
    default void ainterface() {
        System.out.println("A 接口");
    }
    @Override
    default String binterface() {
        return "B 接口";
    }
}

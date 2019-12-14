package com.imooc.Tel;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/14 14:33
 */
public interface IPhoto {

    //具有拍照的能力
    public void photo();

    default void connection(){
        System.out.println("我是IPphoto的connection");
    }

}

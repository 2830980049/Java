package com.imooc.Tel;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/14 15:35
 */

//接口可以实现继承，并且可以继承多个父接口
public interface ISon extends IFather,IFather2 {
    void run();

    default void connection(){
        System.out.println("ISon的connection");
    }


}

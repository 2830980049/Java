package com.imooc.Tel;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/14 11:27
 */
public class SmartWatch implements INet,IPhoto{

    public static final int TEMP = 30;

    @Override
    public void network() { }

    @Override
    public void connection() {
        System.out.println("SmartWatch的connection");
    }

    @Override
    public void photo() {

    }



}

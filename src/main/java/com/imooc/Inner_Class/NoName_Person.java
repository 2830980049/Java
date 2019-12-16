package com.imooc.Inner_Class;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/15 14:03
 */
public abstract class NoName_Person {

    private String name;

    public NoName_Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void read();

}

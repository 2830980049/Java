package com.imooc.Animal_ZhuanXin;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/13 15:48
 */
public  class Animal {

    private String name;
    private int month;
    public Animal() {

    }

    public Animal(String name,int month) {
        this.month = month;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void eat() {
        System.out.println("动物都有吃东西能力");
    }

}

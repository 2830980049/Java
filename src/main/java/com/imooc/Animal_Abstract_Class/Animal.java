package com.imooc.Animal_Abstract_Class;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/13 16:09
 */

//抽象类：不允许实例化，可以通过向上转型，指向子类实例

public abstract class Animal {

    private String name;
    private int month;
    public Animal() {
        super();
    }

    public Animal(String name,int month) {
        super();
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

    //抽象方法：不允许包含方法体；子类中需要重写父类的抽象方法，否则，子类也是抽象类
    public abstract void eat();

    public void  st(){
    }
}


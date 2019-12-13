package com.imooc.Animal_Objec_Class;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/13 16:10
 */
public class Dog extends Animal{

    private String sex;
    public Dog() {
        // TODO Auto-generated constructor stub
    }
    public Dog(String name,int month,String sex) {
        this.setMonth(month);
        this.setName(name);
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public void sleep() {
        System.out.println("小狗睡觉");
    }

    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("狗吃肉");
    }

}

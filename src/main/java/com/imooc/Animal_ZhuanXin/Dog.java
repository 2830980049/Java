package com.imooc.Animal_ZhuanXin;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/13 15:49
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

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("狗吃肉");
    }

}

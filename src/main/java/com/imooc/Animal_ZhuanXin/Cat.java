package com.imooc.Animal_ZhuanXin;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/13 15:48
 */
public class Cat extends Animal{

    private double weight;
    public Cat() {
        // TODO Auto-generated constructor stub

    }
    public Cat(String name,int month,double weight) {

        super(name,month);
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println("小猫跑");
    }

    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("猫吃鱼");
    }

}

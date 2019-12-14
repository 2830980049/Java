package com.imooc.Inner_Class;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/14 21:09
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Heart getHeart(){
        new Heart().temp = 14;
        return new Heart();
    }

    public void eat(){
        System.out.println("人会吃东西");
    }


    //成员内部类
    /*
        1.内部类在外部使用时，无法直接实例化，需要借由外部类信息才能完成实例化
        2.内部类的访问修饰符，可以任意，但是访问范围会受到影响
        3.内部类可以直接访问外部类的成员；如果出现同名属性，优先访问内部类中定义的
        4.可以使用 外部类.this.成员 的方式，访问外部类中同名的信息
        5.外部类访问内部类信息，需要通过内部类实例，无法直接访问
        6.内部类编译后 .class文件命名：外部类$内部类.class
        7.内部类中是否可以包含与外部类相同方法签名的方法
     */
    public class Heart{
        int age = 13;
        int temp = 12;
        public String beat(){
            eat();
            return Person.this.age+"心脏在跳动";
        }
    }

}

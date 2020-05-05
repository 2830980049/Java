package com.imooc.Inner_Class;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/14 21:44
 */
public class Static_Person {
    public int age;

    public Heart getHeart(){
        new Heart().temp = 14;
        return new Heart();
    }

    public void eat(){
        System.out.println("人会吃东西");
    }


    //静态内部类
    /*
        1.静态内部类，只能直接访问外部类的静态方法，如果需要调用非静态成员，可以通过对象实例
        2.静态内部类实例时，可以不依赖于外部类对象
        3.可以通过 外部类.内部类.静态成员 的方式，访问内部类中的静态成员
        4.当内部类属性与外部类属性同名时，默认直接调用内部类中的成员；
          如果需要访问外部类中的静态属性，则可以通过 外部类.属性 的方式
          如果需要访问外部类中的非静态属性，则可以通过 new 外部类().属性 的方式
     */
    public static class Heart{
        static int age = 13;
        int temp = 12;

        public static void say() {
            System.out.println("hello");
        }

        public String beat(){
            new Static_Person().eat();
            return new Static_Person().age+"心脏在跳动";
        }
    }

}

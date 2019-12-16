package com.imooc.Inner_Class;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/15 13:47
 */
public class Way_Person {

    public int age;

    public Object getHeart(){
        //方法内部类
        /*
            1.定义在方法内部，作用范围也在方法内
            2.和方法内部成员使用规则一样,class前面不可以添加public,private,protected,static
            3.类中不能包含静态成员
            4.类中可以包含final,abstract修饰成员
         */
         class Heart{
            public int age = 13;
            int temp = 12;
            public  void say() {
                System.out.println("hello");
            }
            public String beat(){
                new Static_Person().eat();
                return new Static_Person().age+"心脏在跳动";
            }
        }

        return new Heart().beat();
    }

    public  void eat(){
        System.out.println("人会吃东西");
    }



}

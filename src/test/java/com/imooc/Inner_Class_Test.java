package com.imooc;

import com.imooc.Inner_Class.*;
import org.junit.Test;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/14 21:19
 */
public class Inner_Class_Test {
    @Test
    public void tests(){
        Person lili = new Person();
        lili.setAge(12);

        //获取内部类对象实例 方式1：new 外部类.new 内部类
        Person.Heart myheart = new Person().new Heart();
        System.out.println(myheart.beat());

        //获取内部类对象实例 方式2：外部类对象.new 内部类
        myheart = lili.new Heart();
        System.out.println(myheart.beat());

        //获取内部类对象实例 方式3：外部类对象.获取方法
        myheart = lili.getHeart();
        System.out.println(myheart.beat());
    }

    @Test
    public void Static_Person(){

        //获取静态内部类对象实例
        Static_Person.Heart myheart = new Static_Person.Heart();
        System.out.println(myheart.beat());

        Static_Person.Heart.say();


    }

    @Test
    public void Way_Person(){

        Way_Person lili = new Way_Person();
        System.out.println(lili.getHeart());

    }

    /*
    //方案1 根据传入的不同的人的类型，调用对应的read方法
    public void getRead(Man man){
        man.read();
    }

    public void getRead(Woman woman){
        woman.read();
    }
    */
    //方案2
    public void getRead(NoName_Person noName_person){
        noName_person.read();
    }


    @Test
    public void NoName_Persons(){
        /*Man one = new Man();
        Woman two = new Woman();
        getRead(one);
        getRead(two);*/

        //方案3：匿名内部类
        /*
            1.匿名内部类没有类型名称，实例对象名称
            2.编译后的文件名：外部类$数字.class
            3.无法使用private,public,protected,abstract,static修饰
            4.无法编写构造方法，可以添加构造代码块
            5.不能出现静态成员
            6.匿名内部类可以实现接口也可以继承父类，但是不可兼得
         */
        Inner_Class_Test test = new Inner_Class_Test();

        test.getRead(new NoName_Person(){

            @Override
            public void read() {
                System.out.println("男生看科幻类");
            }
        });

        test.getRead(new NoName_Person(){

            @Override
            public void read() {
                System.out.println("女生看爱情类");
            }
        });
    }


}

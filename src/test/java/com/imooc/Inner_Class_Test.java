package com.imooc;

import com.imooc.Inner_Class.Person;
import com.imooc.Inner_Class.Static_Person;
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
        myheart=lili.new Heart();
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

}

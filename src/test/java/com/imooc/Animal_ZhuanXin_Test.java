package com.imooc;

import com.imooc.Animal_ZhuanXin.Animal;
import com.imooc.Animal_ZhuanXin.Cat;
import com.imooc.Animal_ZhuanXin.Dog;
import org.junit.Test;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/13 15:51
 */
public class Animal_ZhuanXin_Test {

    @Test public void Animal_ZhuanXin(){

        // TODO Auto-generated method stub
        Animal one = new Animal();
        // 向上转型 隐形转型 自动转型
        // 父类引用指向子类实例，可以调用子类重写父类的方法以及父类派生的方法，无法调用子类独有方法
        // 小类转型为大类
        Animal two = new Cat();

        Animal three = new Dog();

        one.eat();

        two.eat();
        two.setMonth(1);
        two.setName("2");
        three.eat();

        System.out.println("========================");
        /*
         * 向下转型 强制类型转换
         * 子类引用指向父类对象，此处必须进行强转，可以调用子类特有方法
         * 必须满足转换条件才能进行
         * instanceof运算符
         */
        if(two instanceof Cat) {
            Cat temp = (Cat)two;
            temp.run();
            temp.getMonth();
            System.out.println("two 可以为Cat类型");
        }

        if(two instanceof Dog) {
            Dog temp2 = (Dog)three;
            temp2.sleep();
            temp2.getSex();
            System.out.println("two 可以为Dog类型");
        }

        if(two instanceof Animal) {
            System.out.println("Animal");
        }

        if(two instanceof Object) {
            System.out.println("Object");
        }

        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Cat cat1 = (Cat)cat;
        Dog dog1 = (Dog)dog;
        if (cat1 instanceof Cat){
            System.out.println("cat1");
        }
        if (dog1 instanceof Dog){
            System.out.println("dog1");
        }
        if (cat1 instanceof Animal){
            System.out.println("Animal - cat");
        }
        if (dog1 instanceof Dog){
            System.out.println("Animal - dog");
        }

    }

}

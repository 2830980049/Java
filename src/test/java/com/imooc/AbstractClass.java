package com.imooc;

import com.imooc.Animal_Abstract_Class.Animal;
import com.imooc.Animal_Abstract_Class.Cat;
import com.imooc.Animal_Abstract_Class.Dog;

/**
 * @Author WuQiLi
 * @Date 2020/12/5 18:44
 * @Version 1.0
 */
public class AbstractClass {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        Animal dog = new Dog();
        dog.eat();
    }
}

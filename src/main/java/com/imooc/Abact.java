package com.imooc;

import com.imooc.Animal_Abstract_Class.Animal;
import com.imooc.Animal_Abstract_Class.Cat;

public abstract class Abact {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
    }
}


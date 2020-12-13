package com.edu.Reflect;

import javafx.scene.control.TableRow;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author WuQiLi
 * @Date 2020/10/27 16:51
 * @Version 1.0
 */
public class ReflectCase {

    @Test
    public void CaseOne () throws Exception {
        // 创建Person类对象
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class,Integer.class);
        Person person = (Person)constructor.newInstance("苏苏", 20);
        System.out.println(person.toString());
        // 通过反射 调用对象指定属性 方法
        // Field age = personClass.getDeclaredField("age");
        // age.set(person,18);
        // System.out.println(person.toString());

        Method PublicMethod = personClass.getDeclaredMethod("PublicMethod");
        PublicMethod.invoke(person);
        System.out.println("************************");

        // 调用私有 构造方法
        Constructor constructor2 = personClass.getDeclaredConstructor(String.class);
        constructor2.setAccessible(true);
        Person person2 = (Person) constructor2.newInstance("苏酒儿");
        System.out.println(person2);

        // 调用私有 属性
        Field age2 = personClass.getDeclaredField("age");
        age2.setAccessible(true);
        age2.set(person2, 21);
        System.out.println(person2.toString());

        // 调用私有方法
        Method PrivateMethod = personClass.getDeclaredMethod("PrivateMethod");
        PrivateMethod.setAccessible(true);
        PrivateMethod.invoke(person2);
    }
}

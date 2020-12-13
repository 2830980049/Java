package com.edu.Reflect;

/**
 * @Author WuQiLi
 * @Date 2020/10/29 10:20
 * @Version 1.0
 */
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }

    private void PrivateMethod(){
        System.out.println("私有方法");
    }

    public void PublicMethod(){
        System.out.println("公有方法");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

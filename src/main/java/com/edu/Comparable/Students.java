package com.edu.Comparable;

/**
 * @Author WuQiLi
 * @Date 2020/12/13 12:24
 * @Version 1.0
 */
public class Students implements Comparable{
    private String name;
    private Integer id;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Students() {
    }

    public Students(Integer id, String name, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    /**
     * 指明比较大小方式
     */
    @Override
    public int compareTo(Object o) {
        if (o instanceof Students){
            Students student = (Students)o;
            if (this.id > student.id){
                return 1;
            }
            else if (this.id < student.id){
                return -1;
            }
            else if (this.age >= student.age){
                return -1;
            }
            else {
                return 1;
            }
        }
        throw new RuntimeException("参数不一致");
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

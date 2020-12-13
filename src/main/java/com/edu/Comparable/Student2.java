package com.edu.Comparable;

/**
 * @Author WuQiLi
 * @Date 2020/12/13 15:48
 * @Version 1.0
 */
public class Student2 {
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

        public Student2() {
        }

        public Student2(Integer id, String name, Integer age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

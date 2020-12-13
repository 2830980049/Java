package com.imooc.Link;


/**
 * @Author WuQiLi
 * @Date 2020/10/15 9:45
 * @Version 1.0
 */
public class SingleLinked {
    public int no;
    public String name;
    public String head;
    public SingleLinked next;

    public SingleLinked(int Hno, String Hname, String Hhead){
        this.no = Hno;
        this.name = Hname;
        this.head = Hhead;
    }

    @Override
    public String toString() {
        return "SingleLinked{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", head='" + head + '\'' +
                ", next=" + next +
                '}';
    }
}

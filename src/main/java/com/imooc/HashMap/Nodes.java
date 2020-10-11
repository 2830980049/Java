package com.imooc.HashMap;

public class Nodes {
    private Object context;
    private Nodes next;

    public Nodes(Object context, Nodes next) {
        this.context = context;
        this.next = next;
    }

    public static void main(String[] args) {
        Nodes header = new Nodes(new Object(),null);

        //尾插法
        header.next = new Nodes(new Object(),null);

        //头插法
        header = new Nodes(new Object(),header);
    }
}

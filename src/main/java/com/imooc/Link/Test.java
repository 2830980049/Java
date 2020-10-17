package com.imooc.Link;

/**
 * @Author WuQiLi
 * @Date 2020/10/15 9:49
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        SingleLinked node_1 = new SingleLinked(1,"苏苏-1","涂山-1");
        SingleLinked node_2 = new SingleLinked(2,"苏苏-2","涂山-2");
        SingleLinked node_3 = new SingleLinked(3,"苏苏-3","涂山-3");
        SingleLinked node_4 = new SingleLinked(4,"苏苏-4","涂山-4");
        SingleLinked node_5 = new SingleLinked(-1,"苏苏-5","涂山-5");

        SingleLinkedList singleLinkedList = new SingleLinkedList();

//        singleLinkedList.add(node_1);
//        singleLinkedList.add(node_2);
//        singleLinkedList.add(node_3);
//        singleLinkedList.add(node_4);
        /**
         *  尾插法 排序 升序
         */
//        singleLinkedList.addOrderBy(node_1);
//        singleLinkedList.addOrderBy(node_4);
//        singleLinkedList.addOrderBy(node_3);
//        singleLinkedList.addOrderBy(node_2);
//        singleLinkedList.addOrderBy(node_5);

        /**
         *  头插法
         */
        singleLinkedList.headAdd(node_1);
        singleLinkedList.headAdd(node_2);
        singleLinkedList.headAdd(node_3);
        singleLinkedList.headAdd(node_4);
        singleLinkedList.headAdd(node_5);

        singleLinkedList.list();
        System.out.println(singleLinkedList.getSize());
    }
}

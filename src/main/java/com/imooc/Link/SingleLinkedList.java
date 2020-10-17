package com.imooc.Link;

/**
 * @Author WuQiLi
 * @Date 2020/10/15 9:57
 * @Version 1.0
 */
public class SingleLinkedList {

    private SingleLinked headNode = new SingleLinked(0,"","");
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SingleLinkedList() {
        this.size = -1;
    }

    /**
     * 尾插法
     * @param node
     */
    public void add(SingleLinked node){
        SingleLinked temp = headNode;
        while (true){
            if (temp.next == null){
                break;
            }
            this.size++;
            temp = temp.next;
        }
        temp.next = node;
    }

    /**
     * 尾插法节点排序
     * @param node
     */
    public void addOrderBy(SingleLinked node){
        SingleLinked temp = headNode;
        boolean flag = false;
        while (true){
            if (temp.next == null){break;}
            this.size++;
            if (temp.next.no == node.no){
                flag = true;
                break;
            }
            else if(temp.next.no > node.no){
                break;
            }
            temp = temp.next;
        }
        if (flag){
            System.out.println("该编号已经存在 编号为"+node.no);
        }
        else{
            node.next = temp.next;
            temp.next = node;
        }
    }

    /**
     *  头插法
     */
    public void headAdd(SingleLinked node){
        SingleLinked temp = headNode;
        node.next = temp;
        headNode = node;
        this.size++;
    }

    /**
     *  头插法 节点排序
     */
    public void headAddOrderBy(SingleLinked node){
        SingleLinked temp = headNode;
        while (true){
            if (temp.next == null){break;}
            if (temp.next.no < node.no){
                temp.next = node;
                headNode = node;
            }
        }
    }

    public void list(){
        if (headNode.next == null){
            System.out.println("链表为空");
            return;
        }
        SingleLinked temp = headNode;
        while (true){
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}

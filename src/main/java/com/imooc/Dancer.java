package com.imooc;

import java.io.*;

public class Dancer implements Cloneable,Serializable{
    private String name;
    private Dancer Partner;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Dancer getPartner() {
        return Partner;
    }
    public void setPartner(Dancer partner) {
        Partner = partner;
    }

    public Dancer deepClone() throws IOException, ClassNotFoundException {
        /**
         * 序列化，将内存中对象序列化为字节数组
         */
        //字节数组的输出流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        //对象的输出流
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /**
         * 反序列化，将字节数组转回到对象，同时完成深复制
         */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Dancer)ois.readObject();
    }

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Dancer dancer = new Dancer();
        dancer.setName("苏苏");
        Dancer dancer2 = new Dancer();
        dancer2.setName("艾萨");
        dancer.setPartner(dancer2);
        System.out.println("Partner: "+dancer2.hashCode());
        //浅复制
        Dancer shallow = (Dancer)dancer.clone();
        System.out.println("浅复制："+shallow.getPartner().hashCode());
        //深复制
        Dancer deep = (Dancer)dancer.deepClone();
        System.out.println("深复制："+deep.getPartner().hashCode());
    }
}

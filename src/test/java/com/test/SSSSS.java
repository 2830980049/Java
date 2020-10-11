package com.test;

import com.imooc.SSS;

import java.io.*;

public class SSSSS implements Cloneable,Serializable{
    private String name;
    private SSSSS s;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SSSSS getS() {
        return s;
    }

    public void setS(SSSSS s) {
        this.s = s;
    }

    public SSSSS deep() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (SSSSS) ois.readObject();
    }

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        SSSSS s1 = new SSSSS();
        s1.setName("1");
        SSSSS s2 = new SSSSS();
        s2.setName("2");
        s1.setS(s2);
        System.out.println("S: "+s1.getS().hashCode());
        SSSSS s = (SSSSS)s1.clone();
        System.out.println("C："+s.getS().hashCode());
        SSSSS s3 = (SSSSS)s1.deep();
        System.out.println("D: "+s3.getS().hashCode());
    }
}

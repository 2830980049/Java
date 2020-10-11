package com.imooc.HashMap;
import java.util.HashMap;
import java.util.Objects;

public class hash1 {
    String name;
    public hash1(String name){
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hash1 hashs = (hash1)obj;
        System.out.println(this+" "+obj);
        System.out.println(getClass()+" "+obj.getClass());
        return Objects.equals(name, hashs.name);
    }

    public static void main(String[] args) {
        HashMap<hash1,String> map = new HashMap<hash1,String>();
        map.put(new hash1("hello"),"hello");
        String s = map.get(new hash1("hello"));
        System.out.println(s);
    }
}

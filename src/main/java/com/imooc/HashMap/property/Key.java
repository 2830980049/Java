package com.imooc.HashMap.property;

/**
 * @Author WuQiLi
 * @Date 2020/10/14 9:24
 * @Version 1.0
 */
public class Key implements Comparable<Key>{
    private final int value;

    Key(int value){
        this.value = value;
    }

    @Override
    public int compareTo(Key o) {
        return Integer.compare(this.value, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Key key = (Key)obj;
        return  value == key.value;
    }

    @Override
    public int hashCode() {
        return  value;
    }
}

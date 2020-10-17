package com.imooc.HashMap.property;

import com.imooc.HashMap.property.Key;

/**
 * @Author WuQiLi
 * @Date 2020/10/14 9:41
 * @Version 1.0
 */
public class Keys {
    /**
     * 10_000_000 == 10000000
     */
    public static final int MAX_KEY = 10_000_000;
    private static final Key[] KEYS_CACHE = new Key[MAX_KEY];

    static {
        for (int i = 0; i < MAX_KEY; i++) {
            KEYS_CACHE[i] = new Key(i);
        }
    }

    public static Key of(int value){
        return KEYS_CACHE[value];
    }
}

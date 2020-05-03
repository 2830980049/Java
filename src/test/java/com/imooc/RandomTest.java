package com.imooc;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        Random random = new Random();
        while (true){
            //set.add(random.nextInt(101));
            set.add(random.nextInt(20)+30);
            if (set.size() > 9)
                break;
        }
        for (int s:set)
            System.out.println(s);
    }
}

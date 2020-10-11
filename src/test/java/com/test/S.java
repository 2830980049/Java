package com.test;

public class S {
    public boolean f(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        S s = new S();
        for (int i = 1; i <= 1000; i++){
            if (s.f(i) && i != 1)
                System.out.println(i);
        }
    }
}

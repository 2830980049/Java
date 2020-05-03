package com.imooc;

import java.util.Scanner;

/**
 * 原理是临近的两个数比较大小，将较大的数往后移，O（N2）
 */

public class MaoPaoSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] a = new int[len];
        int cnt = 0;
        while (true){
            cnt++;
            if(cnt > len)break;
            a[cnt-1] = scanner.nextInt();
        }
        int t = 0;
        for (int i = 0; i < len - 1; i++){
            for (int j = 0; j < len - 1 - i; j++){
                if (a[j] > a[j+1]){
                    t = a[j + 1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int b:a)
            System.out.println(b);
    }
}

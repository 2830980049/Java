package com.imooc;

import java.util.Scanner;

/**
 *  将数组划分为两个部分：有序部分和无序部分，
 *  排序过程中每次从无序表中取出第一个元素
 *  重复执行N-1次,默认数组第一项就是有序的O（N2）
 */
public class InsertSort {
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
        int t = 0,j = 0;
        for (int i = 1; i < len; i++){
            if (a[i-1] > a[i]){
                t = a[i];
                j = i;
                while (j > 0 && t < a[j-1]){
                    a[j] = a[j-1];
                    j--;
                }
                a[j] = t;
            }
        }
        for (int b:a)
            System.out.println(b);
    }
}

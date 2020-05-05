package com.imooc;

import java.util.Scanner;

/**
 * 左大右小
 */
public class QuickSort {
    public static void qucikSort(int[] a,int low ,int high){
        int i,j,temp,t;
        if (low > high)
            return;
        i = low;j = high;
        temp = a[low];
        while (i < j){
            //先看右边，依次往左递减
            while (temp <= a[j] && i < j)
                j--;
            //再看左边，依次往右递增
            while (temp >= a[i] && i < j)
                i++;
            if (i < j){
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        a[low] = a[i];
        a[i] = temp;
        qucikSort(a,low,j - 1);
        qucikSort(a,j+1,high);
    }

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
        qucikSort(a,0,len -1);
        for (int b:a)
            System.out.print(b+" ");
    }
}

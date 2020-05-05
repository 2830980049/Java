package com.imooc;

import java.util.Scanner;

public class Tests {
    public static void quickSort(int[] a, int low ,int high){
        if (low > high)
            return;
        int i = low,j = high;
        int temp = a[low],t;
        while (i < j){
            while (i < j && a[j] >= temp)
                j--;
            while (i < j && a[i] <= temp)
                i++;
            if (i < j){
                t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        a[low] = a[i];
        a[i] = temp;
        quickSort(a,low,j-1);
        quickSort(a,j+1,high);
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
        quickSort(a,0,len -1);
        for (int b:a)
            System.out.print(b+" ");
    }

}

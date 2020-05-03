package com.imooc;

import java.util.Scanner;

/**
 * 选择排序是选择数组中最小的数将该数移动到数组最前面，将其他元素往后移动(0N2)
 */
public class ChooseSort {
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
        int minIndex = 0;
        for (int i = 0; i < len; i++){
            minIndex = i;
            for (int j = i + 1; j < len; j++){
                if (a[j] < a[minIndex])
                    minIndex = j;
            }
            // 交换当前索引 i 和最小值索引 minIndex 两处的值
            if (i != minIndex){
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
        }
        for (int b:a)
            System.out.println(b);
    }
}

package com.imooc;

import java.util.Scanner;

/**
 * 左大右小
 * 首先设置一个基准
 * 从后半部分开始，
 *    如果扫描到的值大于基准数据就让high减1
 *    如果发现有元素比该基准数据的值小
 *    就将high位置的值赋值给low位置
 *
 * 然后开始从前往后扫描
 *    如果扫描到的值小于基准数据就让low加1
 *    如果发现有元素大于基准数据的值
 *    就再将low位置的值赋值给high位置的值
 */
public class QuickSort {
    public static void qucikSort(int[] a,int low ,int high){
        int i,j,temp;
        if (low > high)
            return;
        i = low;j = high;
        /* 基准数据 */
        temp = a[low];
        while (i < j){
            //先看右边，依次往左递减
            while (temp <= a[j] && i < j)
                j--;
            //再看左边，依次往右递增
            while (temp >= a[i] && i < j)
                i++;
            if (i < j){
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        /* i == j 把基准数据赋给正确位置 */
        a[low] = a[i];
        a[i] = temp;
        qucikSort(a,low,i - 1);
        qucikSort(a,i+1,high);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {49, 38, 65, 97, 76, 13, 27, 49, 10};
        qucikSort(a,0,a.length -1);
        for (int b:a)
            System.out.print(b+" ");
    }
}

package com.imooc;
import java.util.Arrays;
import java.util.Scanner;

public class HalfSorts {

    public int half(Sort a[],int low,int high,int key){
        while (low <= high){
            int mid = (low+high)/2;
            if (a[mid].getA() > key)
                high = mid - 1;
            else if(a[mid].getA() < key)
                low = mid + 1;
            else
                return a[mid].getA();
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        Sort[] a = new Sort[len];
        int cnt = 0;
        while (true){
            cnt++;
            if (cnt > len)break;
            a[cnt-1] = new Sort();
            a[cnt-1].setA(scanner.nextInt());
        }
//        for (int i = 0; i < len; i++)
//            System.out.println(a[i].getA());
        Arrays.sort(a);
        HalfSorts sorts = new HalfSorts();
        System.out.println(sorts.half(a,0,a.length,23));
    }
}

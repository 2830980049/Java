import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2020/6/16 12:41
 */
public class dasd {

    public static void quicks(int[] a,int low, int high){
        if (low > high)return;
        int i = low, j = high, k = a[low];
        while (i < j){
            while (k <= a[j] && i < j)
                j--;
            while (k >= a[i] && i < j)
                i++;
            if (i < j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[low] = a[i];
        a[i] = k;
        quicks(a, low, i - 1);
        quicks(a,i + 1, high);
    }

    public static void main(String[] args) {
        int[] a = {2,74,32,634,1,2,3};
        quicks(a,0, a.length - 1);
        for (int i : a){
            System.out.print(i+" ");
        }
    }
}

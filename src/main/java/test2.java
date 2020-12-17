import com.edu.Comparable.Student2;
import com.edu.Comparable.Students;
import com.imooc.Tel.INet;

import java.util.*;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2020/8/19 17:15
 */
public class test2 {

    public static int[] maoPao(int[] a, int low, int high){
        int i = low, j = high, temp = a[low];
        while (i < j){
            if (temp <= a[j]){
                j--;
            }
            if (temp >= a[i] && i < j){
                i++;
            }
            if (i < j){
                int t = a[j];
                a[i] = t;
                a[j] = a[i];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1,7,4,5,2,1};
        List<Student2> list = new ArrayList<Student2 >();
        list.add(new Student2(6,"苏苏",20));
        list.add(new Student2(3,"苏酒儿",21));
        list.add(new Student2(1,"艾萨",18));
        list.add(new Student2(1,"雅雅",23));
        list.sort(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else if (o1.getAge() > o2.getAge()) {
                    return -1;
                } else if (o1.getAge() < o2.getAge()) {
                    return 1;
                }
                return 0;
            }
        });
        for (Student2 student: list){
            System.out.println(student);
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(4);
        list1.add(6);
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>(list1);
        list1.clear();
        HashMap<Integer,Integer> hashMap = new HashMap(10);
        hashMap.get(1);
        hashMap.put(1,1);
        list1.addAll(hashSet);
        for (Integer lists: list1){
            System.out.println(lists);
        }
    }
}

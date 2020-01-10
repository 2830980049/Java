package com.imooc.Map;

import javax.security.sasl.SaslClient;
import java.util.*;

public class Dictionary {

    public static void main(String[] ars)

    {
        Map<String, String> map = new HashMap<String, String>();

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.print("输入Key值:");
            String key = scanner.next();
            System.out.print("输入Value值:");
            String value = scanner.next();
            map.put(key, value);
            i++;
        }
        System.out.println();

        System.out.println("***************************");
        System.out.println("使用迭代器输出所有Value：");
        Iterator<String> it = map.values().iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");

        System.out.println();
        System.out.println("**************************");
        System.out.println("通过entrySet方法得到key - value:");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for(Map.Entry<String,String> entry:entrySet){
            System.out.print(entry.getKey()+"-");
            System.out.println(entry.getValue());
        }

        System.out.println();
        System.out.println("*****************************");
        //通过Key找到Value
        //使用keySet
        String str = "苏苏";
        //取到ketSet
        Set<String> keySet = map.keySet();
        for (String key:keySet)
            if(str.equals(key)) {
                System.out.println("找到了" + "键值为：" + key + "-" + map.get(key));
                break;
            }


    }
}

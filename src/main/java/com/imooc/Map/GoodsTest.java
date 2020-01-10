package com.imooc.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String,Goods> map = new HashMap<String,Goods>();
        int i = 0;
        while(i < 3){
            System.out.print("第"+(i+1)+"条:");
            String goodsid = scanner.next();
            //判断编号是否存在
            if(map.containsKey(goodsid)){
                System.out.println("该编号已经存在!");
                continue;
            }
            String goodsname = scanner.next();
            double goodsprice = 0;
            try {
                goodsprice = scanner.nextDouble();
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println("价格格式不正确！");
                scanner.next(); //接受错误数据，让其不影响下次输入
                continue;
            }
            Goods goods = new Goods(goodsid, goodsname, goodsprice);
            map.put(goodsid,goods);
            i++;
        }

        System.out.println("商品信息为：");
        Iterator<Goods> iterator = map.values().iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

    }
}

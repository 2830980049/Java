package com.imooc.Exception;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/15 14:54
 */
public class TryDemoOne {
    //要求：定义2个整数，输出2数之商

    public static void main(String[] args){
        /*int one = 12;
        int two = 2;
        System.out.println("one和two的商："+(one/two));*/

        //要求：定义2个整数，接受用户输入
        Scanner scanner = new Scanner(System.in);
        try {
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            System.out.println("one和two的商：" + (one / two));
        }
        catch (ArithmeticException e){
            //终止程序运行
            System.exit(1);
            e.printStackTrace();
            System.out.println("除数不能为0");
        }
        catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("请输入整数");
        }
        catch (Exception e){
            System.out.println("出错");
        }
        finally {
            System.out.println("结束");
        }

    }

}

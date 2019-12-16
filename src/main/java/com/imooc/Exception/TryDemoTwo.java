package com.imooc.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/15 15:24
 */
public class TryDemoTwo {

    public static void main(String[] s){
        int result = test();
        System.out.println("one和two的商：" + result);

    }

    public static int test(){
        Scanner scanner = new Scanner(System.in);
        try {
            int one = scanner.nextInt();
            int two = scanner.nextInt();
            return one/two;
        }
        catch (ArithmeticException e){
            System.out.println("除数不能为0");
            return 0;

        }
        finally {
            return -1000;
        }

    }

}

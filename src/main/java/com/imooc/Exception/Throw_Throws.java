package com.imooc.Exception;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/15 15:36
 */
public class Throw_Throws {

    public static void main(String[] s){
        try{
            int result = test();
            System.out.println("one和two的商：" + result);
        }
        /*catch (ArithmeticException e){
            System.out.println("除数不为0");
            e.printStackTrace();
        }*/
        catch (Exception e){

        }

        testAge();

        try {
            testAge1();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try {
            testAge2();
        }
        catch (ZhiDinYi e){
            System.out.println(e.getMessage());
            System.out.println("不允许");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    /*public static int test() throws ArithmeticException{
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        return one/two;
    }*/

    /**
     *
     * @return
     * @throws Exception
     */

    public static int test() throws Exception{
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        return one/two;
    }

    //throw抛出异常对象的处理方案
    /*
        1.通过try .. catch 包含throw语句 -- 自己抛自己处理
        2.通过throws在方法声明出抛出异常类型--谁调用谁处理--调用者可以自己处理，可以继续上抛
     */
    public static void testAge(){
        try {
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if(age < 18 || age > 90)
                throw new Exception("未满足条件");
            else System.out.println("Come on");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void testAge1() throws Exception{
        try {
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if(age < 18 || age > 90)
                throw new Exception("未满足条件");
            else System.out.println("Come on");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void testAge2() throws ZhiDinYi{
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age < 18 || age > 90)
            throw new ZhiDinYi();
        else System.out.println("Come on");
    }


}

package com.edu.IO.IO;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author WuQiLi
 * @Date 2020/12/17 16:21
 * @Version 1.0
 *  异常处理：保证流资源一定可以执行关闭操作
 *  读入文件一定存在，否则就会报异常
 */
public class IO_1 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            // 1. 实例化File类对象
            File file = new File("test.txt");
            // 2. 提供具有流
            fr = new FileReader(file);
            // 3. 数据读入
            char[] chars = new char[2];
            int len;
            /**
             * read() 返回一个字符，如果到达文件末尾，返回-1
             * read(char []) 返回每次读入字符数组中的字符个数，末尾返回-1
             */
            StringBuilder str = new StringBuilder();
            while ((len = fr.read(chars)) != -1){
                /**
                 *  错误写法
                 *  for(int i = 0; i < chars.length; i++)
                 *  System.out.println(chars[i]);
                 *  因为数组 没有重新创建 而是采用替换相应位置
                 *
                 *  String str = new String(chars);
                 *  System.out.println(str);
                 * */
                String no = new String(chars, 0, len);
                str.append(no);
            }
            System.out.println(str);
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

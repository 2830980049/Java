package com.edu.IO.IO;

import java.io.*;

/**
 * @Author WuQiLi
 * @Date 2020/12/17 17:40
 * @Version 1.0
 */
public class IO_3 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(file);
            char[] chars = new char[1024];
            int len = 0;
            StringBuilder str = new StringBuilder();
            while ((len = fr.read(chars)) != -1){
                String no = new String(chars,0,len);
                str.append(no);
            }
            System.out.println("读取成功 "+str);
            fw = new FileWriter(file, true);
            fw.write("苏苏-666\n");
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package com.edu.IO.IO;

import java.io.*;

/**
 * @Author WuQiLi
 * @Date 2020/12/17 21:19
 * @Version 1.0
 * 非文本缓冲流
 */
public class IO_7 {
    public static void main(String[] args) {
        File file_1 = new File("test.txt");
        File file_2 = new File("test2.txt");
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            fr = new FileReader(file_1);
            fw = new FileWriter(file_2, true);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            char[] chars = new char[1024];
            int len = 0;
            StringBuilder sb = new StringBuilder();
            while ((    len = br.read(chars)) != -1){
                String st = new String(chars,0, len);
                bw.write(st);
                sb.append(st);
            }
            System.out.println("文本读取成功 " + sb);
            System.out.println("文本写入成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

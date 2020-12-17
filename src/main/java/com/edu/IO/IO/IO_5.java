package com.edu.IO.IO;

import java.io.*;

/**
 * @Author WuQiLi
 * @Date 2020/12/17 20:21
 * @Version 1.0
 * 图片复制
 */
public class IO_5 {

    public static void main(String[] args) {
        File file = new File("test.jpg");
        File file1 = new File("test2.jpg");
        FileInputStream fs = null;
        FileOutputStream fo = null;
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            fs = new FileInputStream(file);
            fo = new FileOutputStream(file1);
            StringBuilder sb = new StringBuilder();
            while ((len = fs.read(bytes)) != -1){
                String st = new String(bytes,0, len);
                fo.write(bytes,0,len);
                sb.append(st);
            }
            System.out.println("读取成功 "+sb);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fs != null)
                    fs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fo != null)
                    fo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

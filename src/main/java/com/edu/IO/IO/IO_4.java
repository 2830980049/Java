package com.edu.IO.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author WuQiLi
 * @Date 2020/12/17 20:02
 * @Version 1.0
 * 使用它可能出现中文乱码
 */
public class IO_4 {
    public static void main(String[] args) {
        File file = new File("test.jpg");
        FileInputStream fs = null;
        try {
            fs = new FileInputStream(file);
            int len = 0;
            byte[] bits = new byte[1024];
            StringBuilder sb = new StringBuilder();
            while ((len = fs.read(bits)) != -1){
                String st = new String(bits, 0, len);
                sb.append(st);
            }
            System.out.println("图片读取成功 "+sb);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fs != null)
                    fs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

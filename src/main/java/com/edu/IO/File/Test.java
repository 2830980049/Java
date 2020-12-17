package com.edu.IO.File;

import java.io.File;
import java.io.IOException;

/**
 * @Author WuQiLi
 * @Date 2020/12/17 15:27
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/IOTEST/test.txt");
        System.out.println(file.getParent());
        File file1 = new File(file.getParent(),"test2.txt");
        file1.createNewFile();

        File file2 = new File(file.getParent(), "test");
        file2.mkdirs();
    }
}

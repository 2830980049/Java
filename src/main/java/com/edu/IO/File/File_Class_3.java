package com.edu.IO.File;

import java.io.File;

/**
 * @Author WuQiLi
 * @Date 2020/12/17 14:42
 * @Version 1.0
 * boolean  isDirectory()  判断是否为文件目录
 * boolean  isFile()       判断是否为文件
 * boolean  exists()       判断是否存在
 * boolean  canRead()      判断是否可读
 * boolean  canWrite()     判断是否可写
 * boolean  isHidden()     判断是否隐藏
 */
public class File_Class_3 {
    public static void main(String[] args) {
        File file_1 = new File("test.txt");
        File file_2 = new File("D:\\IO");
        System.out.println(file_2.isDirectory());
        System.out.println(file_1.isFile());
        System.out.println(file_1.exists());
        System.out.println(file_1.canRead());
        System.out.println(file_1.canWrite());
        System.out.println(file_1.isHidden());
    }
}

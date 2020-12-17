package com.edu.IO.File;

import java.io.File;

/**
 * @Author WuQiLi
 * @Date 2020/12/16 19:42
 * @Version 1.0
 * File类 使用
 * 1. File类的一个对象 代表一个文件 或 一个文件目录（文件夹）
 */
public class File_Class {

    /**
     * 1.
     * 如何创建File类实例
     *    File(String filePath)
     *    File(String parent, String child)
     *    File(File parentFile, String children)
     * 2.
     *  相对路径
     *  绝对路径
     *
     * 3.
     *   File.separator 根据操作系统，动态提供分隔符
     */
    public static void main(String[] args) {
        File file = new File("test.txt");
        File absFile = new File("D:"+File.separator+
                "IO"+File.separator+
                "test.txt");
        File file_2 = new File("D:"+File.separator+
                "IO"+File.separator);
        File file_3 = new File(file_2, "test.txt");
    }

}

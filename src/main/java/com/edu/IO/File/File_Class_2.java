package com.edu.IO.File;

import java.io.File;

/**
 * @Author WuQiLi
 * @Date 2020/12/16 20:11
 * @Version 1.0
 * getAbsolutePath() 绝对路径
 * getPath()         获取路径
 * getName()         获取文件 目录名
 * getParent()       获取上传文件目录路径 无 返回null
 * length()          获取文件长度（字节数）
 * lastModified()    获取上次修改时间
 *
 * 适用于文件目录
 * String[]  list()   获取目录中所有文件和目录
 * File[] listFiles()  获取目录中所有文件和目录的File数组
 */
public class File_Class_2 {
    public static void main(String[] args) {
        File file_1 = new File("test.txt");
        File file_2 = new File("D:"+File.separator+"IO"+
                File.separator+"test.txt");
        System.out.println(file_1.getAbsoluteFile());
        System.out.println(file_1.getPath());
        System.out.println(file_1.getName());
        System.out.println(file_1.getParent());
        System.out.println(file_1.length());
        System.out.println(file_1.lastModified());

        System.out.println("*********************");

        System.out.println(file_2.getAbsoluteFile());
        System.out.println(file_2.getPath());
        System.out.println(file_2.getName());
        System.out.println(file_2.getParent());
        System.out.println(file_2.length());
        System.out.println(file_2.lastModified());

        File file_3 = new File("D:\\IDEA Files\\Java\\");
        String[] list = file_3.list();
        File[] files = file_3.listFiles();
        for (String s : list){
            System.out.println(s);
        }
        for (File s : files){
            System.out.println(s);
        }

        /**
         *  boolean renameTo(File dest) 把文件移动到指定路径 并重命名
         *  file_4在硬盘中存在
         *  file_5不能在硬盘中存在
         */
        File file_4 = new File("test.txt");
        File file_5 = new File("D:\\IO\\test.txt");
        boolean rename =  file_4.renameTo(file_5);
    }
}

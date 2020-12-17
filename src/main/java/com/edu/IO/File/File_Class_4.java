package com.edu.IO.File;

import java.io.File;
import java.io.IOException;

/**
 * @Author WuQiLi
 * @Date 2020/12/17 14:52
 * @Version 1.0
 * 创建硬盘中对应文件或文件目录
 * boolean createNewFile()  创建文件，若文件存在，不创建
 * boolean mkdir            创建文件目录，如果目录存在或上层目录不存在，不创建
 * boolean mkdirs           创建文件目录,如果文件目录不存在，一并创建
 *
 * 删除磁盘中文件或文件目录
 * boolean delete() 删除文件或者文件夹
 *  注意事项
 *      Java中删除不走回收站
 */
public class File_Class_4 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if (!file.exists()){
            file.createNewFile();
            System.out.println("创建成功");
        }
        else{
            file.delete();
            System.out.println("删除成功");
        }
        File file_1 = new File("D:/IOTEST/TEST");
        if (file_1.exists()){
            file_1.delete();
            System.out.println("删除目录成功");
        }
        else{
            file_1.mkdirs();
            System.out.println("创建目录成功");
        }
    }
}

package com.edu.IO.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author WuQiLi
 * @Date 2020/12/17 17:23
 * @Version 1.0
 * 如果不存在，会自动创建此文件
 * 如果存在，默认会覆盖里面的内容
 * FileWriter(file,true) 不覆盖
 */
public class IO_2 {
    public static void main(String[] args) {
        /** 1. 提供File对象 */
        File file = new File("test.txt");
        /** 2. 提供相应流 */
        FileWriter fw = null;
        try {
            fw = new FileWriter(file,true);
            /** 3. 写入数据 */
            fw.write("苏苏 - 苏酒儿"+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            /** 4. 关闭 */
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

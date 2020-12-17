package com.edu.IO.IO;

import java.io.*;

/**
 * @Author WuQiLi
 * @Date 2020/12/17 20:39
 * @Version 1.0
 * 缓存流 包含 节点流
 * 作用：
 *   提供流读取、写入速度
 *   原因:  内部提供一个缓存区
 *
 */
public class IO_6 {
    public static void main(String[] args) {
        /** 1. 造文件 */
        File file_1 = new File("test.jpg");
        File file_2 = new File("test2.jpg");
        /** 2. 造流 */
        FileInputStream fis = null;
        FileOutputStream fos = null;
        /** 3. 造缓冲流 */
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            fis = new FileInputStream(file_1);
            fos = new FileOutputStream(file_2);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) != -1){
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            /**
             * 关闭
             * 先关外层 再关内层
             * 关闭外层时，内层流会自动关闭
             * */
            try {
                if (bos != null)
                    bos.close();
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

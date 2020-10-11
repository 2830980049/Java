package com.imooc.IO;
import java.io.*;
public class copyFile {
    public static void main(String[] args) throws IOException {
        File source = new File("F:/IDEA Files/Java/struct.txt");
        File file = new File("F:/struct.txt");
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(file);
            // 代表存储的缓冲区 1024字节
            byte[] buf = new byte[1024];
            int index;
            // 循环读取
            while ((index = input.read(buf)) != -1){
                // 写入从0开始index的最大长度
                output.write(buf,0,index);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            input.close();
            output.close();
        }
    }
}

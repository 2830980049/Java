package com.imooc;

public class Death_Lock {
    private static String A = "A文件";
    private static String B = "B文件";

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                while (true){
                    //线程A被上锁
                    synchronized (A){
                        System.out.println(this.getName()+":文件A写入");
                        //要继续往下运行B需要被释放
                        synchronized (B){
                            System.out.println(this.getName()+":文件B写入");
                        }
                    }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                while (true){
                    //线程B被上锁
                    synchronized (B){
                        System.out.println(this.getName()+":文件B写入");
                        synchronized (A){
                            System.out.println(this.getName()+":文件A写入");
                        }
                    }
                }
            }
        }.start();
    }
}

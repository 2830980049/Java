package com.imooc.Exception;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/16 18:30
 */
public class Relation {

    public static void main(String[] agrs){
        try {
            testthree();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void testone() throws ZhiDinYi{
        throw new ZhiDinYi();
    }

    public static void testtwo() throws Exception{
        try {
            testone();
        }
        catch (ZhiDinYi e){
            throw new Exception("我是新异常1",e);
        }
    }

    public static void testthree() throws Exception{
        try {
            testtwo();
        }
        catch (Exception e){
            Exception e1 = new Exception("我是新异常2");
            e1.initCause(e);
            throw e1;
            //throw new Exception("我是新异常2",e);
        }
    }

}

package com.imooc.Tel;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/14 11:24
 */
public class FourthPhone extends ThirdPhone implements IPhoto,INet{

    /*public void photo(){
        System.out.println("手机拍照");
    }*/



    public void network(){
        System.out.println("上网");
    }

    public void game(){
        System.out.println("玩游戏");
    }

    @Override
    public void photo() {
        System.out.println("手机拍照");
    }

    @Override
    public void connection() {
        System.out.println("我是FouthPhone的");
    }

}

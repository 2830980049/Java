package com.imooc.Tel;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2019/12/14 11:21
 */
public class TelPhone {
    private String brand;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void call(){
        System.out.println("手机可以打电话");
    }


}

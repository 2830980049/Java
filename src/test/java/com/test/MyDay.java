package com.test;

public enum MyDay {
    MONDAY(1,"星期一"),THUSDAY(2,"星期二");
    private int code;
    private String name;

    private MyDay(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

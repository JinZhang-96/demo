package com.gjbs.classdecorate;

public class StaticClass {

    public static int staticMethod () {
        System.out.println("静态方法");
        return 9;
    }

    public static void main(String[] args) {
        StaticClass.staticMethod();
    }

}

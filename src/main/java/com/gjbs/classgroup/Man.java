package com.gjbs.classgroup;

public class Man {
    private int height;
    private String name;

    public int eat(int param1, long param2) {
        System.out.println("我吃饭了");
        System.out.println("参数1的具体数值：" + param1);
       return 6;
    }




    public static void main(String[] args) {
        Man man = new Man();

        int returnValue  = man.eat(4,12L);
        System.out.println(returnValue);
    }
}

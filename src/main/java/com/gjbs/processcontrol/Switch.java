package com.gjbs.processcontrol;

public class Switch {

    public static void main(String[] args) {
        char condition = 'e';

        switch (condition){
            case 'a':
                System.out.println("开关是a");
                break;
            case 'b':
                System.out.println("开关是b");
                break;
            case 'c':
                System.out.println("开关是c");
                break;
            default:
                System.out.println("无法确定开关数值");
                break;
        }

        System.out.println("switch 执行完毕");


    }
}

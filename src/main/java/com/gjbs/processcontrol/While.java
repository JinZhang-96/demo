package com.gjbs.processcontrol;

public class While {
    public static void main(String[] args) {

        int i = 1;

        while(i < 5){
            // 操作逻辑
            System.out.println("i等于"+ i+",此时小于5");
            i = i + 1;
        }

        System.out.println("i等于"+ i+",此时不小于5");

        //

    }
}

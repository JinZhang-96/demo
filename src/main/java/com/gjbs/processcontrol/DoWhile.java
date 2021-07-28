package com.gjbs.processcontrol;

public class DoWhile {
    public static void main(String[] args) {
        int i = 2;
        do {
            System.out.println("此时i等于" + i);
            i = i + 2;
//            i = i+ 8;
        }  while (i < 10);

        System.out.println("----此时i等于" + i);
    }
}

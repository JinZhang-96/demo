package com.gjbs.student;

public class Gjcfb {
    public void p() {
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Gjcfb gjcfb = new Gjcfb();
        gjcfb.p();
    }
}



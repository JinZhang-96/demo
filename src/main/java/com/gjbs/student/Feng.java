package com.gjbs.student;

public class Feng {

    public void p(){
        int a = 0;
        int b = 0;

        for(a=1;a<=5;a++){
            for(b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");

        for (a = 5; a >=1; a--){
            for (b = 1; b <= a; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
           Feng feng = new Feng();
           feng.p();
    }
}

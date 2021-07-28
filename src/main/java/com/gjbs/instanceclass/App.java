package com.gjbs.instanceclass;

public class App {

    public int productValue() {
        return (int) (Math.random() * 10);
    }

    public int getValue() {
        return this.productValue();
    }


//    public static void main(String[] args) {
//        System.out.println(new App().getValue());
//    }


}

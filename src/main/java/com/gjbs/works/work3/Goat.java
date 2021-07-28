package com.gjbs.works.work3;

/**
 * 羊的类
 */
public class Goat extends Animal{


    /*
        羊有吃的行为， 它是吃草的
     */
    public void eat(){
        System.out.println("羊吃草");
    }

    public static void main(String[] args) {
        Goat goat = new Goat();
        goat.eat();
        goat.walk();
    }

}

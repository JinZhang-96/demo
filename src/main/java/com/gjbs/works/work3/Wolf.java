package com.gjbs.works.work3;

/**
 * 狼的类
 */
public class Wolf extends Animal{

    /*
       狼有吃的行为， 它是吃肉的
    */
    public void eat(){
        System.out.println("狼吃肉");
    }

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.eat();
        wolf.walk();
    }
}

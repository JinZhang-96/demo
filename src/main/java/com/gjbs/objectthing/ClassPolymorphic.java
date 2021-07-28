package com.gjbs.objectthing;

public class ClassPolymorphic {

    /**
     * 跳
     */
    void dump(){
        System.out.println("跳高");
    }

    void dump(String name){
        System.out.println(name + "跳高");
    }


    public static void main(String[] args) {
        ClassPolymorphic classPolymorphic = new ClassPolymorphic();
        classPolymorphic.dump();
        classPolymorphic.dump("小明");
    }
}

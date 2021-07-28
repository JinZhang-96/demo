package com.gjbs.controlaccess;

public class PrivateClass {

    private int a = 2;


    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        ProtectedClass protectedClass = new ProtectedClass();
        PrivateClass privateClass = new PrivateClass();

        privateClass.a = 4;
        protectedClass.a = 4;
        publicClass.a = 4;
    }
}

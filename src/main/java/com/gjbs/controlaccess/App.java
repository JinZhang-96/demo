package com.gjbs.controlaccess;

public class App {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        ProtectedClass protectedClass = new ProtectedClass();
        PrivateClass privateClass = new PrivateClass();

//        privateClass.a = 4;
        protectedClass.a = 4;
        publicClass.a = 4;


    }
}

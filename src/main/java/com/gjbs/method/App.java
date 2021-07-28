package com.gjbs.method;

public class App {

    public static int staticMethodName() {
        return 1;
    }

    public int methodName(int a){

        int d = this.methodName('a');

        return 1;
    }

//    public int methodName(char a){
//        return 'a';
//    }

    public static void main(String[] args) {
        int a = App.staticMethodName();


        //  Singture

//        int b = App.methodName(1);
    }

}

package com.gjbs.method;

public class RecursionMethod {
    // 正数  第一个孩子为2岁;
    //  0 0 0 0 0 0 0 0 0 //50
//    public  int age(int n){
//
//        if(n == 1){
//            return 50;
//        }else{
//           return  age(n - 1) - 3;
//        }
//
//    }

    /**
     * 数学公式的实现： 当a=1时  f(a) = 1;
     *                 a >1时, f(a) = f(a -1) +1
     * @param a
     * @return
     */
    public int a(int a){
        if(a == 1){
            return 1;
        }else{
            return a(a - 1) + 1;
        }
    }

    public static void main(String[] args) {
        RecursionMethod recursionMethod = new RecursionMethod();
        // 倒着算
        int age = recursionMethod.a(17);
        System.out.println(age);
    }


}

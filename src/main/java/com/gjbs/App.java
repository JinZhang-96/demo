package com.gjbs;

import com.gjbs.controlaccess.PrivateClass;
import com.gjbs.controlaccess.ProtectedClass;
import com.gjbs.controlaccess.PublicClass;

/**
 * Hello world!
 */
public class App 
{




    /**
     *
     * @param args
     */
    public static void main( String[] args )
    {
        String a = new String("123");
//        String b = new String("123");
        String c = a.intern();
//        System.out.println(a == b);
//        System.out.println(c == b);
        System.out.println(c == a);


//        int a = 20;
//        int b = -100;
//        b +=a; //  b = b + a
//        b -=a; //  b = b - a
//        b *=a; //  b = b * a
//        b /=a; //  b = b / a
//        b %=a; //  b = b % a
//        System.out.println(b);
//        boolean r = a < b;
//        boolean r = a > b;
//        boolean r = a >= b;
//        boolean r = a <= b;
//        boolean r = a == b;

//        String s1 = new String("1111");
//        String s2 = new String("111122");
//        boolean r1 = s1.equals(s2);
//        boolean r = a != b;
//        System.out.println(r);

        //2的(n-1)次方
        //  111  10进制     第n位 位 10的(n-1)次方

         /* int a = 20;          000000000000000010100
          * int b = 5;           000000000000000000101
          * & 与                                 00100   结果 ： 4
          * |或                                  10101   结果：21
          * ^ 异或                               10001   结果：17
          * ! 非                                 11010   结果:
          * & 与  | 或   ^异或 ~非
        */

//         int c = a & b;
//         int d = a|b;
//         int e = a ^ b;
//
//         int f = ~b;
//         System.out.println(e);
//         System.out.println(f);


        // && 且  || 或   短路运算


        //
//        int c = 7;
        int d = 5;
        int s = 0;
//        int s1 = c==6? ( s = c + d ): 4;

//        c > d ? System.out.println("c大于d") : System.out.println("c不大于d");
//        boolean r = ( c == d ) && (c == d) && (++c > d);
//        System.out.println(c);

//        boolean r1 = ( c == d ) || (c > d) || (c > ++d);
//        System.out.println(s1);
//        System.out.println(r1);



//        App app = null;


//        PublicClass publicClass = new PublicClass();
//        ProtectedClass protectedClass = new ProtectedClass();
//        PrivateClass privateClass = new PrivateClass();
//
////        privateClass.a = 4;
////        protectedClass.a = 4;
//        publicClass.a = 4;


//        int b = 32903;
//        long c = b;
//        System.out.println(c);


//        int a = 1;
//        byte b = 2;
//        a = a + b; // 隐式类型转化
//        System.out.println(a);

//         int a = new Integer(10);
//
//         System.out.println(a);

    }
}

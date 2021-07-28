package com.gjbs.processcontrol;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class If {

    public static void main(String[] args) {

        int a = 6, b = 4;

//        boolean condition = a < b;
//
//        if( condition  ) {
//            System.out.println("a 小于 b");
//        } else {
//            System.out.println("a 大于 b");
//        }
//

        if( a < 5){
            System.out.println("a 小于 5");
        }else if(a == 5){
            System.out.println("a 等于 5");
        }else{
            System.out.println("a 大于 5");
        }

    }
}

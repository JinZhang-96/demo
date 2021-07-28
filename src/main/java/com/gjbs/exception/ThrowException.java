package com.gjbs.exception;

import java.io.IOException;

public class ThrowException {



    public void exth() throws Exception {
            System.out.println("下面抛出一个异常");
            throw new Exception("运行异常");
//            throw new IOException("运行异常");
    }


    public static void main(String[] args) throws Exception {

        ThrowException throwException = new ThrowException();
//        try {
            throwException.exth();
//        } catch (Exception e) {
////            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }

    }
}

package com.gjbs.exception;

import com.gjbs.instanceclass.Children;
import com.gjbs.instanceclass.Parent;

import java.io.File;
import java.io.IOException;

public class TestException {

    // try catch finally throw  throws




    public void e() throws Exception {

        int a =12;
        int b = 4;
        int x = a/b;

        if(x != 3){
            throw new Exception("不是预期结果");
        }

//        try {
//            String s = "aa";
//            int b = Integer.parseInt(s);
//        } catch (NumberFormatException e){
//            System.out.println("数字强转出现错误");
//        } finally {
//            System.out.println("方法执行完成");
//        }


    }




    public static void main(String[] args) {

        TestException t = new TestException();

        try {
            t.e();
        } catch (Exception e){
            System.out.println("结果不正确");
        } finally {
            System.out.println("方法执行完成");
        }

//        System.out.println("异常测试开始");


//       Children t = (Children) new Parent();

//        try {
////            String a = "aa";
////            int b = Integer.parseInt(a);
////            File file = new File("F:\\test\\a.txt");
////            file.createNewFile();
//        } catch (NumberFormatException e){
//            System.out.println("字符串转整型 错误");
//        }finally {
//
//        System.out.println("异常测试结束");
//        }






    }
}

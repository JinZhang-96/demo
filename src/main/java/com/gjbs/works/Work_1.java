package com.gjbs.works;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 在类中创建一个方法， 计算给的半径为r的圆形面积和周长
 */
public class Work_1 {

    // boolean flag : false 计算面积  true 计算周长

    /**
     *
     * @param r  扇形半径
     * @param flag   false 计算面积  true 计算周长
     * @return 扇形的面积或周长
     */
    public float compute(float r, boolean flag){

        float result = 0F;
        if(flag) {
            // 计算周长
            result = 2 * (float) Math.PI * r;
        } else{
            // 计算面积
//            result = (float) Math.PI * r * r;
            result = (float) Math.PI * (float) Math.pow(r, 2);
        }
        // 四舍五入，只保留小数点后2位
       return new BigDecimal(result).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }



    public static void main(String[] args) {

        System.out.println(Math.pow(10,3));
        int a = 1;
        while( a < 10) {
            // 定义一个单精度浮点类型的变量
            float r = 0F;
            // 定义一个布尔类型的变量
            boolean flag = false;
            // 创建一个接受用户输入的对象
            Scanner scanner = new Scanner(System.in);

            //  获取圆形的半径
            do {
                // 输入语句，提示用户输入
                System.out.println("请输入圆形的半径：");
                scanner = new Scanner(System.in);
            } while (!scanner.hasNextFloat());
            // 把输入的扇形半径赋值给变量r
            r = scanner.nextFloat();

            // 获取计算的方式
            do {
                // 输入语句，提示用户输入
                System.out.println("如果计算周长请输入true,计算面积请输入false：");
                scanner = new Scanner(System.in);
            } while (!scanner.hasNextBoolean());
            // 把输入的计算方式赋值给变量flag
            flag = scanner.nextBoolean();

            Work_1 work_1 = new Work_1();
            float result = work_1.compute(r, flag);
            System.out.println((flag ? "周长为：" : "面积为：") + result);
        }

    }
}

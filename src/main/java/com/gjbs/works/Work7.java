package com.gjbs.works;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 定义一个函数来遍历数组参数和求和
 */
public class Work7 {

    public double sum(double[] arrays){
        double sum = 0D;
        return sum;
    }


    public double sum(Double[] arrays){
        double sum = 0D;
//        for(int i = 0; i < arrays.length; i++){
//            sum += arrays[i];
//        }
        for(double item : arrays){
            sum += item;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("请输入求和的数组， 每个元素以回车结束, 输入结束后请输入一个非空且非数字类型的字母结束");

        Scanner scanner = new Scanner(System.in);
        List<Double> list = new ArrayList();

        while (scanner.hasNextDouble()){
            double d = scanner.nextDouble();
            list.add(d);
        };

        System.out.println(list.size());

        Work7 work7 = new Work7();
        double sum = work7.sum(list.toArray(new Double[0]));
        System.out.printf("%s%f", "数组的和为：", sum);
    }
}

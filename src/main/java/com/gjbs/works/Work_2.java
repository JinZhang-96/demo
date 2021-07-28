package com.gjbs.works;

import java.util.Scanner;

/**
 * 在类中创建一个方法，输入年份a和月份b,返回a年b月的天数。1、3、5、7、8、10、12为31天，闰年2月为29天，平年2月为28天，其余月为30天
 */
public class Work_2 {

    public int  getDays(int year, int month) {
        // 定义整型变量存储 month月的天数
        int days = 0;

        if(1 <= month && 12 >= month){

            switch (month){
                case 1:
                    days = 31;
                    break;
                case 2:
                    days = year % 4 == 0 ? 29 : 28;
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;
            }

        }else{
            System.out.printf("%d%s\n", month,"是无效的月份");
        }
        return days;
    }


    public static void main(String[] args) {


        while (1 < 2){

            // 定义一个整数类型的变量
            int year = 0;
            // 定义一个整数类型的变量
            int month = 0;
            // 创建一个接受用户输入的对象
            Scanner scanner = new Scanner(System.in);

            //  获取用户输入的年份
            do {
                // 输入语句，提示用户输入
                System.out.println("请输入年份：");
                scanner = new Scanner(System.in);
            } while (!scanner.hasNextInt());
            // 把输入的年份赋值给变量year
            year = scanner.nextInt();

            // 获取用户输入的月份
            do {
                // 输入语句，提示用户输入
                System.out.println("请输入月份：");
                scanner = new Scanner(System.in);
            } while (!scanner.hasNextInt());
            // 把输入的计算方式赋值给变量flag
            month = scanner.nextInt();

            Work_2 work_2 = new Work_2();

            int days = work_2.getDays(year, month);

            System.out.printf("%d%s%d%s%d\n",year,"年的", month, "月份的天数为：",days);
        }
    }

}

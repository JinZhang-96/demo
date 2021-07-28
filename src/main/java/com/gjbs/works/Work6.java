package com.gjbs.works;

import java.util.Scanner;

/**
 * 通过递归计算：1,1,2,3,5,8,13...这样一个数列就是斐波那契数列，求第n项的值。
 * 第n项 = 第n-1项+第n-2项
 * 在n > 2情况下  此函数成立
 */
public class Work6 {


    /**
     * 当n = 5; 第5项 = 第4项 + 第3项；第五项 = 第四项 + 第三项 + 第二项 + 第一项；
     * 第五项 = 第三项 + 第二项 + 第二项 + 第一项 + 第二项 + 第一项；  第五项 = 第二项 + 第一项 + 第二项 + 第二项 + 第一项 + 第二项 + 第一项
     * @param n
     * @return
     */
    public long fbnq(int n){
        long v = 0;
        // 设  n = 5;
        // fbnq (5) = fbnq(5 - 1) + fbnq(5 -2);
        // fbnq (5 - 1) = fbnq(5 - 1 - 1) + fbnq(5 - 1 -2);
        // fbnq (5 - 2) = fbnq(5 - 2 - 1) + fbnq(5 - 2 -2);
        if( n > 2){
            v = fbnq(n - 1) + fbnq(n -2);
        }else{
            v = 1;
        }
        return v;
    }


    public static void main(String[] args) {
            Work6 work6 = new Work6();
            System.out.println("请输入斐波那契数列的项数:n");
            int n = new Scanner(System.in).nextInt();
            System.out.println("输入的项数为：" + n);
            long v = work6.fbnq(n);
            System.out.printf("%s%d%s%d\n","第",n,"项的值为",v);
    }

}

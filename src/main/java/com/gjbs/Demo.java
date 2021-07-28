package com.gjbs;

public class Demo {

    /**
     * 冒泡排序算法实现方法
     *
     * @param a 待排序数组
     */
    public static void bubbleSort(int[] a) {

    }

    /**
     * 选择排序算法实现方法
     *
     * @param a 待排序数组
     */
    public static void selectSort(int[] a) {

    }


    public static void main(String[] args) {
        int[] b = {2, 1, 3, 5, 0, 6};

        // 第一次排序                               第二次排序
        // 第一次： 2 1 --> 1 2   1,2,3,5,0,6       // 第一次： 1 2 --> 1 2   1,2,3,0,5,6
        // 第二次： 2 3 --> 2 3   1,2,3,5,0,6       // 第二次： 2 3 --> 2 3   1,2,3,0,5,6
        // 第三次： 3 5 --> 3 5   1,2,3,5,0,6       // 第三次： 3 0 --> 0 3   1,2,0,3,5,6
        // 第四次： 5 0 --> 0 5   1,2,3,0,5,6       // 第四次： 3 5 --> 3 5   1,2,0,3,5,6
        // 第五次： 5 6 --> 5 6   1,2,3,0,5,6

//        for(int j = 0; j < b.length - 1; j++) {
//            for (int i = 0; i < b.length - 1 - j; i++) {
//                if (b[i] > b[i + 1]) {
//                    int temp = b[i];
//                    b[i] = b[i + 1];
//                    b[i + 1] = temp;
//                }
//            }
//        }

//        for(int i: b){
//            System.out.print(i+"\t");
//        }
//        System.out.println();
        for (int i = 0; i < b.length - 1; i++) {
            if (b[i] > b[i + 1]) {
                int temp = b[i];
                b[i] = b[i + 1];
                b[i + 1] = temp;
            }
        }
        for (int i = 0; i < b.length - 2; i++) {
            if (b[i] > b[i + 1]) {
                int temp = b[i];
                b[i] = b[i + 1];
                b[i + 1] = temp;
            }
        }
        for (int i = 0; i < b.length - 3; i++) {
            if (b[i] > b[i + 1]) {
                int temp = b[i];
                b[i] = b[i + 1];
                b[i + 1] = temp;
            }
        }
        for (int i = 0; i < b.length - 4; i++) {
            if (b[i] > b[i + 1]) {
                int temp = b[i];
                b[i] = b[i + 1];
                b[i + 1] = temp;
            }
        }
        for (int i = 0; i < b.length - 5; i++) {
            if (b[i] > b[i + 1]) {
                int temp = b[i];
                b[i] = b[i + 1];
                b[i + 1] = temp;
            }
        }
        for (int i : b) {
            System.out.print(i + "\t");
        }
    }

}
class a{

}

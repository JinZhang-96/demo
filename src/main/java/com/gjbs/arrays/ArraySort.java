package com.gjbs.arrays;

import java.util.Arrays;

public class ArraySort {


    public static void bubbleSort(int[] array){
  // 10元素    0。。。。。9    98765432   9次

        for(int i = 0; i < array.length - 1; i++){ // 对未排好序的元素排序
            for(int j  = 0 ; j < array.length - 1 - i; j++){ // 把最大的数放到数组的最后边
                if(array[j] > array[j + 1]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j ] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        ArraySort arraySort = new ArraySort();
        int n = 10;// 设定数组的大小
        int[]  a = {1276,	7065,	4479,	6780,	1843,	9349,	8587,	5890,	9347,	6345};
//                new int[n];
//        for(int i = 0; i<n; i++){
//            a[i] = (int) (Math.random() * 10000);
//        }

        System.out.println("排序前：");
        for(int i : a){
            System.out.print(i+"\t");
        }
        System.out.println();



        // 开始排序
        for(int j = 1 ; j < a.length ;j++ ){

            for(int i = 1; i < a.length - (j - 1); i++){
                if(a[i - 1] > a[i]){
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }

        }

//        for(int i = 0; i < a.length - 1; i++){
//            if(a[i] > a[i + 1]){
//                int temp = a[i + 1];
//                a[i + 1] = a[i];
//                a[i ] = temp;
//            }
//        }
//        for(int i = 0; i < a.length - 1 - 1; i++){
//            if(a[i] > a[i + 1]){
//                int temp = a[i + 1];
//                a[i + 1] = a[i];
//                a[i ] = temp;
//            }
//        }

        System.out.println("排序后：");
        for(int i : a){
            System.out.print(i+"\t");
        }


//        Arrays.sort(a);

//        ArraySort.bubbleSort(a);

//        System.out.println("排序后：");
//        for(int i : a){
//            System.out.print(i+"\t");
//        }
        // a = {1,2,4,6,8}
        // 冒泡、选择、插入、希尔、快速、桶（基数）、归并



    }
}

package com.gjbs.works;

public class Work8
{

    public static void sort(int[] a){

        for(int j = 0; j < a.length - 1; j++ ){

            for(int i = 0; i < a.length - 1 - j; i++){
                // 如果数组前面的数比后一个大， 则把对换2个数在数组中的位置
                if(a[i] > a[i + 1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i + 1] = temp;
                }
            }

        }


    }


    public static void main(String[] args) {
        int[]   a = new int[10];

        for(int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random() * 10000);
        }

        System.out.println("排序前数组：");

        for(int item : a){
            System.out.print(item+ "\t");
        }

        Work8.sort(a);

        System.out.println();
        System.out.println("排序后数组：");

        for(int item : a){
            System.out.print(item+ "\t");
        }
    }
}

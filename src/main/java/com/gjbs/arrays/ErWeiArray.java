package com.gjbs.arrays;

public class ErWeiArray {


    public static void main(String[] args) {
//        int[] a = new int[7];

        int[][] a1 = {{3,5}, {45,46,47}, {1,2,3,4} };




//        int v = 1;
//        for(int i = 0; i < 5 ; i++ ){
//            for(int j = 0; j < 4 ; j++ ){
//                a1[i][j] = v++;
//            }
//        }
//
//
        for(int i = 0; i < a1.length ; i++ ){
            for(int j = 0; j < a1[i].length; j++ ){
                System.out.print("\t" + a1[i][j]);
            }
            System.out.println();
        }

    }
}

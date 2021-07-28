package com.gjbs.arrays;
// 孙浩天
public class SelectSort {


    /**
     * 选择排序算法实现
     * @param array
     */
    public static void sort(int[] array){

        // 选择排序 执行 n - 1次排序
        for(int i = 0; i < array.length - 1; i++){
            // 假设乱序数组中的最大元素为头部元素
            int max = i;
            // 用乱序数组中的假设最大元素  和 乱序数组中的所有元素比较，   找到真实的最大元素的位置
            for(int j = max + 1; j < array.length; j++ ){
                if(array[max] < array[j]){
                    max = j;
                }
            }
            // 排序后如果乱序数组中最大数的位置为刚开始假设的最大数的位置，这个位置是乱序数组的头部位置， 则不需要交换
            if(max == i){
                continue;
            }
            // 交换乱序数组中头部元素和乱序数组中最大元素的位置
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }


        // 设数组的长度为n, 那该for循环可执行n - 1次
//        for(int i = 0; i < array.length - 1; i++){
//            int min = i;
//            for(int j = i + 1; j < array.length; j++){
//                if(array[min] > array[j]){
//                    min = j;
//                }
//            }
//            // 如果未排序数组的始点就是最小值就没必要交换了
//            if(min == i) {
//                continue;
//            }
//            int temp = array[i];
//            array[i] = array[min];
//            array[min] = temp;
//        }

    }


    public static void main(String[] args) {
        int [] a = {2,3,1,4,6,9,0,5};

        System.out.println("排序前：");
        for(int i : a){
            System.out.print(i+"\t");
        }
        System.out.println();

        SelectSort.sort(a);

        System.out.println("排序后：");
        for(int i : a){
            System.out.print(i+"\t");
        }
        System.out.println();


    }


}

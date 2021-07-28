package com.gjbs.works;

public class Work9 {
    /*
     *   对字符串"hello word"中的字母进行排序
     */


    public static void main(String[] args) {

        String s = "hello word";
        char[] c = s.toCharArray();


        for(int i =0; i < c.length - 1; i++){
            for(int j = 0; j < c.length - 1 - i; j++){
                if(c[j] > c[j + 1]){
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }

        StringBuilder s1 = new StringBuilder("");
        for(char item : c){
            s1.append(item);
        }
        System.out.print(s1.toString());

    }
}

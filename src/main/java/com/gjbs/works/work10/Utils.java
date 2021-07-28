package com.gjbs.works.work10;

import javafx.print.Collation;

public class Utils {


    /**
     * 复制数组并扩大数组的空间
     *
     * @param array
     * @return
     */
    public static Object[] copyAndExpandArray(Object[] array) {

        // 扩大数组的空间为原先数组的1倍
        Object[] temp = new Object[array.length * 2];
        // 把原来数组的数据复制到新数组中
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        return temp;
    }


    public static Object[] moveArrayFromIndex(int startIndex, Object[] array) {
        for (int i = startIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = null;
        return array;
    }

    public static String getFormatString(int a, String content, Color color) {
//        String a1 = "\u001b[31m";
//        if(color == Color.RED){
//
//        }
        String result = "";
        if (a > content.length()) {
            int blank = a - content.length();
            if (blank % 2 != 0) {
                int b = (blank - 1) / 2;
                if (b != 0) {
                    for (int i = 0; i < b + 1; i++) {
                        result += " ";
                    }
                    result += content;
                    for (int i = 0; i < b; i++) {
                        result += " ";
                    }
                } else {
                    result += " ";
                    result += content;
                }
            } else {
                int b = blank / 2;
                for (int i = 0; i < b; i++) {
                    result += " ";
                }
                result += content;
                for (int i = 0; i < b; i++) {
                    result += " ";
                }
            }
        } else {
            result = content;
        }
//        if (color == Color.RED) {
//            result = "\u001b[31m" + result;
//        }
        return result;
    }

    public static String getFormatString(int a, String content) {
        if (a > Utils.computeLength(content)) {
            int blank = a - Utils.computeLength(content);
            String result = "";
            if (blank % 2 != 0) {
                int b = (blank - 1) / 2;
                if (b != 0) {
                    for (int i = 0; i < b + 1; i++) {
                        result += " ";
                    }
                    result += content;
                    for (int i = 0; i < b; i++) {
                        result += " ";
                    }
                } else {
                    result += " ";
                    result += content;
                }

            } else {
                int b = blank / 2;
                for (int i = 0; i < b; i++) {
                    result += " ";
                }
                result += content;
                for (int i = 0; i < b; i++) {
                    result += " ";
                }
            }
            return result;
        } else {
            return content;
        }
    }

    public static int computeLength(String v) {
        int l = 0;
        char[] a = v.toCharArray();
        for (char i : a) {
            if (i >= 0x4e00 && i <= 0x9fa5) {
                l += 2;
            } else {
                l += 1;
            }
        }
        return l;
    }
}

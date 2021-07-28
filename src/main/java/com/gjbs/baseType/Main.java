package com.gjbs.baseType;

public class Main {

    short b; // 2字节 1字节等于8位   2的16次方 -1
    int a; // 4字节
    long c = 73247532652L; // 8字节
    float d = 1.2F; // 4字节   1.4E-45(IEEE754规定32位内容)	3.4028235E38（IEEE754）
    double e = 1.4444D;// 8字节
    char f; // 2字节   主要存储accii码
    byte g;// 1字节  -127 127
    boolean h; // 1字节

    public static void main(String[] args) {

    }

}

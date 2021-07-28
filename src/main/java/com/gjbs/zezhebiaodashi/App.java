package com.gjbs.zezhebiaodashi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\d+?)");
        Matcher matcher = pattern.matcher("12a1211");
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
    static Pattern pattern = Pattern.compile("");
    public static void main(String[] args) {
        Matcher matcher = pattern.matcher("Prathmesh@bl");
        if (matcher.matches()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

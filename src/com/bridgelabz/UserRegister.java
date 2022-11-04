package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
    static Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    public static void main(String[] args) {
        Matcher matcher = pattern.matcher("Prathmesh");
        if (matcher.matches()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}

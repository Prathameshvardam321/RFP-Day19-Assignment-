package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
    static Pattern firstName= Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    static Pattern lastName= Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    static Pattern emailId = Pattern.compile("^[A-Za-z]{3,}[.]?[a-z]*@([a-z]+)[.]?[a-z]+[.]?[a-z]*$");
    public static void main(String[] args) {
        Matcher matcher = emailId.matcher("Prathmesh.vardam@bl.co");
        if (matcher.matches()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

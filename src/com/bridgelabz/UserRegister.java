package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
    static Pattern firstName= Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    static Pattern lastName= Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    static Pattern emailId = Pattern.compile("^[A-Za-z]{3,}[.]?[a-z]*@([a-z]+)[.]?[a-z]+[.]?[a-z]*$");
    static Pattern countryCode = Pattern.compile("^[0-9]{2}[\\s][0-9]{10}$");
    public static void main(String[] args) {
        Matcher matcher = countryCode.matcher("91 9930516251");
        if (matcher.matches()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

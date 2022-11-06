package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
    static Pattern firstName= Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    static Pattern lastName= Pattern.compile("^[A-Z]{1}[a-z]{2,}");
    static Pattern emailId = Pattern.compile("^[A-Za-z]{3,}[.]?[a-z]*@([a-z]+)[.]?[a-z]+[.]?[a-z]*$");
    static Pattern countryCode = Pattern.compile("^[0-9]{2}[\\s][0-9]{10}$");
    static Pattern passwordRule1 = Pattern.compile("^[a-zA-Z]{8,}");
    static Pattern passwordRule2 = Pattern.compile("^(?=.*[A-Z]).{8,}$");
    static Pattern passwordRule3 = Pattern.compile("^(?=.[A-Z])(?=.*[0-9]).{8,}$");
    static Pattern passwordRule4 = Pattern.compile("^(?=.*[A-Z])(?=.*[!@#$%&*()])(?=.*[0-9])(?=\\S+$).{8,}$");
    static Pattern emailPattern = Pattern.compile("^[a-z]{3,}[0-9]*([+-._]{1}[0-9]+)*@[a-z0-9]+[.]{1}[a-z]{2,}[,]?([.]{1}[a-z]{1,})?");
    public static void main(String[] args) {
        Matcher matcher = emailPattern.matcher("abc@gmail.com.aa");
        if (matcher.matches()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

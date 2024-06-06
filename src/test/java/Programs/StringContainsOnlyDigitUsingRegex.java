package Programs;

import java.util.regex.Pattern;

public class StringContainsOnlyDigitUsingRegex {
    public static void main(String[] args) {
      String s = "12333QRR4" ;
        boolean containsDigit = Pattern.matches("\\d+", s);
        if(containsDigit){
            System.out.println("contains only digit");
        }else{
            System.out.println("doesn't contains digit");
        }
    }
}

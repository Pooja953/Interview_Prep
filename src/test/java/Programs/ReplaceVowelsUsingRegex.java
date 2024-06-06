package Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceVowelsUsingRegex {
    public static void main(String[] args) {
        String s = "My nAme is Pooja";
        System.out.println(s.replaceAll("[aeiouAEIOU]",""));}
}

package Programs;

import org.testng.Assert;

import java.util.Arrays;

public class AnagramProgram {
    public static void main(String[] args) {
        String s = "loveuu";
        String s1 = "silent";
       boolean result = checkAnagram(s,s1);
       if(result){
           System.out.println("Is a anagram");
       }else{
           System.out.println("Not a anagram");
       }
    }

    public static boolean checkAnagram(String s,String s1) {
        if (s.length() != s1.length()) {
            return false;
        }

        String str1 = s.toUpperCase();
        String str2 = s1.toUpperCase();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

      return  Arrays.equals(ch1,ch2);
    }

    
}


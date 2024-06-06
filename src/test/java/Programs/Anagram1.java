package Programs;

import java.util.Arrays;

public class Anagram1 {
    public static void main(String[] args) {
     boolean result = isAnagram("silnt","tenlis");
      if(result){
          System.out.println("Is a Anagram");
      }else{
          System.out.println("Not a Anagarm");
      }
    }

    public static boolean isAnagram(String a, String b){
        if(a.length()!= b.length()){
            return false;
        }

        String str1 = a.toUpperCase();
        String str2 = b.toUpperCase();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       return Arrays.equals(ch1,ch2);
    }
}


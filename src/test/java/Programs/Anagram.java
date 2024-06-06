package Programs;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        boolean result = isAnagram("silent", "listen");
        if(result){
            System.out.println("Is Anagram ");
        }else{
            System.out.println("Not a Anagram");
        }
    }

    public static boolean isAnagram(String a,String b){
        if(a.length()!= b.length()){
            return false;
        }

        String a1 = a.toUpperCase();
        String b1 = b.toUpperCase();


        char[] ch = a1.toCharArray();
        char[] ch1 = b1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

       return Arrays.equals(ch,ch1);

    }
}

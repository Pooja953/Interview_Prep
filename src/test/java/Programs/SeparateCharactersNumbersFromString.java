package Programs;

public class SeparateCharactersNumbersFromString {
    public static void main(String[] args) {
        String s1 = "asdf234@$%%ghh";
        String alpha = "";
        String digit = "";
        String spclChar = "";

        for (int i=0;i<s1.length();i++){
            if(Character.isAlphabetic(s1.charAt(i))){
                 alpha=alpha+s1.charAt(i);
            } else if(Character.isDigit(s1.charAt(i))){
                digit=digit+s1.charAt(i);
            } else{
                spclChar=spclChar+s1.charAt(i);
            }
        }
        System.out.println("Alphabets :"+ alpha);
        System.out.println("Digits :"+ digit);
        System.out.println("Spcl Char :"+ spclChar);

    }
}

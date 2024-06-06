package Programs;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String s = "poojapailij";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean isRepeated = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(j) == ch) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                System.out.println("First non-repeated character: " + ch);
                break;
            }
        }
    }
}





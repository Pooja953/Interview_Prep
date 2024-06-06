package RestAssured;

public class AddNum {

    public static void main(String[] args) {

        String input="gasvav10 hgg30jhjh2";


        int num = 0;

       // TODO OutPut =       10+30+2=42

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
              int  number = Integer.parseInt(String.valueOf(ch));
              num = num+number;

            }
        }



        System.out.println(num);
    }

}

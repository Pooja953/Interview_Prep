package Programs;

public class ReverseStringWithoutAlteringSpace {
    public static void main(String[] args) {
        String s = "My name is Pooja";
        //TODO output :aj ooPs ie manyM //

        StringBuilder stringBuilder = new StringBuilder();

        for (int i=s.length()-1;i>=0;i--){
//            System.out.print(s.charAt(i));
            stringBuilder.append(s.charAt(i));
        }

        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                stringBuilder.insert(i,' ');
            }
        }

        System.out.println(stringBuilder);
    }

}

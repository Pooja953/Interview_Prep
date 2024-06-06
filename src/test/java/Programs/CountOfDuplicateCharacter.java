package Programs;

import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicateCharacter {
    public static void main(String[] args) {
        String s = "Pooja";
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
              int count = map.get(s.charAt(i));
               map.put(s.charAt(i),count+1);
            }
        }


        for (Map.Entry<Character,Integer> map1 : map.entrySet()){
            System.out.println(map1.getKey()+" "+ map1.getValue());
        }


    }
}

package Interview;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfElements {

    public static void main(String[] args) {
       String input="aaabbc";
     //  TODO      output="3a2b1c"

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i <input.length() ; i++) {
            if(!map.containsKey(input.charAt(i))){
                 map.put(input.charAt(i),1);
            }else{
                Integer count = map.get(input.charAt(i));
                map.put(input.charAt(i),count+1);
            }
        }

        for (Map.Entry<Character,Integer> map1: map.entrySet()){
            System.out.println(map1.getKey()+" "+ map1.getValue());
        }

    }
}

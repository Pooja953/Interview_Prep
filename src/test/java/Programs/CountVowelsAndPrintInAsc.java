package Programs;

import java.util.*;

public class CountVowelsAndPrintInAsc {
    public static void main(String[] args) {
        String s = "bengaaaluru";

        TreeMap<Character,Integer> map = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='a'|| ch =='e'||ch=='i'||ch=='o'||ch=='u') {
                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                } else {
                    Integer count = map.get(ch);
                    map.put(ch, count + 1);
                }
            }
        }

        for (Map.Entry<Character,Integer>map1:map.entrySet()) {
            System.out.println(map1.getKey()+" "+ map1.getValue());
        }


        ArrayList<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(map.entrySet());

        Collections.sort(sortedList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });




//        List<Map.Entry<Character,Integer>> sortedlist = new ArrayList<>(map.entrySet());
//        Collections.sort(sortedlist,  new Comparator<Map.Entry<Character, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });


    }

}

package Programs;

import java.util.*;

public class CountOfDupChar {
    public static void main(String[] args) {

        String s = "Pooojjaaa";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                Integer count = map.get(ch);
                map.put(ch, count + 1);
            }
        }

        for (Map.Entry<Character, Integer> map1 : map.entrySet()) {
            System.out.println(map1.getKey() + " " + map1.getValue());
        }
        ArrayList<Map.Entry<Character, Integer>> arrayList = new ArrayList<>(map.entrySet());


//        Collections.sort(arrayList, new Comparator&lt;Map.Entry&lt;Character, Integer&gt;&gt;() {
//            @Override
//            public int compare(Map.Entry&lt;Character, Integer&gt; o1, Map.Entry&lt;Character, Integer&gt; o2) {
//                int valueComparison = o1.getValue().compareTo(o2.getValue());
//                if (valueComparison == 0) {
//                    return o1.getKey().compareTo(o2.getKey());
//                } else {
//                    return valueComparison;
//                }
//            }
//        });


//
        Collections.sort(arrayList, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                int valueComparison = o1.getValue().compareTo(o2.getValue());
                if (valueComparison == 0) {
                    return o1.getKey().compareTo(o2.getKey());
                } else {
                    return valueComparison;
                }
            }
        });

    }
}

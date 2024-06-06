package Programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestThirdMinimum {

        public static void main(String[] args) {
            Integer[] arr = {6, 3, 8, 1, 9, 3, 5};

            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr.length;j++){
                    if(arr[i]<arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }

            List<Integer> arraysWithDublicate = Arrays.asList(arr);

            Set<Integer> set = new LinkedHashSet(arraysWithDublicate);

            Integer[] setOfInteger = set.toArray(new Integer[0]);

            System.out.println(Arrays.toString(setOfInteger));

//            System.out.println(Arrays.toString(arr));
            System.out.println("Second Largest : "+arr[arr.length-2]);
        }
}



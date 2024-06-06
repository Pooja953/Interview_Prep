package Programs;

import java.util.HashMap;

public class TwoSumProgram {
    public static void main(String[] args) {
        int[] arr = {2,4,5,2,4,3,3,6,8};
        int target = 6;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                if(num + arr[j] == target) {
                    System.out.println("Two sum number "+arr[j]+","+arr[i]+"and indexes are "+i+","+j);
                }
            }


        }

    }

}

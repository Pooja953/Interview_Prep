package RestAssured;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {5,6,10,2,4};

        int fl = 0;
        int sl = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>fl) {
                sl = fl;
                fl = arr[i];
            } else if (arr[i]>sl){
                sl = arr[i];
            }
        }

        System.out.println("Second Largest : "+ sl);

    }
}

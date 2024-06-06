package Programs;

public class NumbersWithEvenLength {
    public static void main(String[] args) {
        int[] arr = {12, 456, 32, 4578, 56745};
        for (int num : arr) {
            if (String.valueOf(num).length() % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}

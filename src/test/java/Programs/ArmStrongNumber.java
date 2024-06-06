package Programs;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int copy = num;
        int sum = 0;
        while(num!=0){
            int rem = num % 10;
             sum = sum+rem*rem*rem;
             num = num/10;
        }
        if(copy==sum){
            System.out.println("is an anagram");
        }else{
            System.out.println("Not an anagram");
        }
    }
}

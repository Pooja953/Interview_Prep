package Programs;

public class SumOfNumberFromString {
    public static void main(String args[]) {
        String    input= "*1 Rental $70,000Shopping  $299. Expenses $800 . House$2,00,000.";
// Output:    271099
// Note: Number prefix with $ can only be consider for
        // Remove non-numeric characters except commas
        String cleanedInput = input.replaceAll("[^\\d,]", "");

        System.out.println(cleanedInput);

        // Split the string into individual numbers
        String[] numbers = cleanedInput.split(",");

        // Initialize total amount
        int totalAmount = 0;

        // Iterate through numbers, convert to integers, and add to total amount
        for (String number : numbers) {
            // Remove any commas in the number
//            number = number.replaceAll(",", "");
            // Convert to integer and add to total
            totalAmount += Integer.parseInt(number);
        }

        // Print the total amount
        System.out.println("Total amount: $" + totalAmount);
    }
}

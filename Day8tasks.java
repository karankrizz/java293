public class Day8tasks {
    public static void main(String args[]) {
        System.out.println("\n[1] REVERSE THE ARRAY");

        int[] arr = { 10, 20, 30, 40, 50 };

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("\n[2] FIND THE ARRAY VALUE ");
        int[] numbers = { 0, 50, 60, 70, 2 };
        int search = 2;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Searched element: " + search + " is found" : "Element is not found");
        System.out.println("\n[3] COUNT THE EVEN NUMBERS AND THE ODD NUMBERS ");

        int[] values = { 20, 27, 57, 60, 97, 23, 88, 55, 100 };
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);

        System.out.println("\n[4] FIND THE COUNT OF +VE AND -VE AND ZERO");
        int[] number = { 20, -5, 0, 15, -10, 0, 25, -8 };

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < number.length; i++) {

            if (number[i] > 0) {
                positiveCount++;
            } else if (number[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);
    }
}
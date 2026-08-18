public class Day8 {
    public static void main(String args[]) {
        System.out.println("\n[1] BASIC METHOD ");

        int[] marks = { 90, 80, 70, 60, 50 };
        System.out.print(marks[0] + " ");
        System.out.print(marks[1] + " ");
        System.out.print(marks[2] + " ");
        System.out.print(marks[3] + " ");
        System.out.print(marks[4] + " ");

        System.out.println("\n[2] USING THE FOR LOOP CONCEPT");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("\n[3] USING STRING DATA TYPE WITH ARRAY USING THE FOR LOOP ");

        String[] names = { "kirubha", "karan", "R" };
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println("\n[4] SUM OF THE ARRAY VALUES");
        int[] values = { 95, 98, 96, 97, 93 };
        int sum = 0;
        for (int i = 0; i < values.length; i++) {

            sum = sum + values[i];
            System.out.println("step :" + sum);
        }
        System.out.println("Total sum of the values : " + sum);

        System.out.println("\n[5] AVERAGE OF THE ARRAY VALUES");

        double average = (double) sum / values.length;
        System.out.println("Average of the total sum: " + average);

        System.out.println("\n[6] FIND THE LARGEST ARRAY VALUE ");
        int[] valuess = { 90, 20, 500, 520, 450 };
        int largest = valuess[0];
        for (int i = 0; i < valuess.length; i++) {
            if (valuess[i] > largest) {
                largest = valuess[i];
            }
        }
        System.out.println("Largest value: " + largest);

        System.out.println("\n[7] FIND THE SMALLEST ARRAY VALUE ");
        int[] svalues = { 90, 20, 500, 520, 450 };
        int smallest = svalues[0];
        for (int i = 0; i < svalues.length; i++) {
            if (svalues[i] < smallest) {
                smallest = svalues[i];
            }
        }
        System.out.println("Smallest value: " + smallest);

        System.out.println("\n[8] FIND THE EVEN AND THE ODD NUMBERS");
        int[] numbers = { 1, 2, 7, 6, 5 };
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is a even number");
            } else {
                System.out.println(numbers[i] + " is a odd number");
            }
        }
        System.out.println("\n[9] USING THE FOR EACH LOOP FOR THE NUMBERS");

        for (int number : numbers) {
            if (number % 2 == 0)
                System.out.println(number + " is a even number");
            else {
                System.out.println(number + " is a odd number");
            }
        }
    }
}
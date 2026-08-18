public class Day3 {

    public static void main(String[] args) {
        System.out.println("\n[1] DO-WHILE LOOP");

        int number = 1;

        do {
            System.out.println("Number : " + number);
            number++;
        } while (number <= 5);

        System.out.println("\n[2] WHILE LOOP");

        int numberr = 1;

        while (number <= 5) {
            System.out.println("Number : " + numberr);
            number++;
        }

        System.out.println("\n[3] FOR LOOP");

        for (int numbber = 1; numbber <= 5; numbber++) {
            System.out.println("Number : " + numbber);
        }

        System.out.println("\n[4] EVEN NUMBERS");

        for (int evenNumber = 0; evenNumber <= 100; evenNumber++) {
            if (evenNumber % 2 == 0) {
                System.out.print(evenNumber + " ");
            }
        }
        System.out.println("\n[4] EVEN NUMBERS");

        for (int evenNumber = 0; evenNumber <= 100; evenNumber++) {
            if (evenNumber % 2 == 0) {
                System.out.print(evenNumber + " ");
            }
        }

        System.out.println("\n[5] ODD NUMBERS");

        for (int oddNumber = 0; oddNumber <= 100; oddNumber++) {
            if (oddNumber % 2 != 0) {
                System.out.print(oddNumber + " ");
            }
        }

        System.out.println("\n[6] PRIME NUMBERS");

        for (int primeNumber = 2; primeNumber <= 100; primeNumber++) {

            boolean isPrime = true;

            for (int divisor = 2; divisor < primeNumber; divisor++) {

                if (primeNumber % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(primeNumber + " ");
            }
        }

        System.out.println("\n[7] PRINT A TO Z");

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
    }

}
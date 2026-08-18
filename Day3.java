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

        for (int number = 1; number <= 5; number++) {
            System.out.println("Number : " + number);
        }

        System.out.println("\n[4] EVEN NUMBERS");

        for (int number = 1; number <= 20; number++) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n[5] ODD NUMBERS");

        for (int number = 1; number <= 20; number++) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n[6] PRIME NUMBERS");

        for (int number = 2; number <= 20; number++) {

            boolean prime = true;

            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\n[7] PRINT A TO Z");

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
    }

}
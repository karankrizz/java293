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

    }

}
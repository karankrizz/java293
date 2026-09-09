import java.util.Scanner;

public class Day9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[1] CHECK THE NUMBER IS IT A +VE OR -VE OR ZERO");
        System.out.println("Enter the number: ");
        int check = sc.nextInt();
        if (check > 0) {
            System.out.println(check + "- positive number");
        } else if (check < 0) {
            System.out.println(check + "- Negative number");
        } else {
            System.out.println("It is zero");
        }

        System.out.println("\n[2] CHECK IF THE NUMBER IS EVEN OR ODD");
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " - is a even number");
        } else {
            System.out.println(number + " - is a odd number");
        }

        System.out.println("\n[3]CALCULATE THE SUM,MULTIPLICATION,DIVISON OF GIVEN 2 NUMBERS");
        System.out.println("Enter the first number :");
        double a = sc.nextInt();
        System.out.println("Enter the second number :");
        double b = sc.nextInt();

        double sum = a + b;
        System.out.println("SUM OF THE TWO NUMBERS  :" + sum);

        double multiply = a * b;
        System.out.println("MULTIPLICATION OF THE TWO NUMBERS :" + multiply);

        double division = a / b;
        System.out.println("divison of two numbers : " + division);

        sc.close();

    }
}
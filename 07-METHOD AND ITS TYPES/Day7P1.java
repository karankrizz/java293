public class Day7P1 {

    // 1. Without Argument & Without Return
    static void display() {
        System.out.println("Hello World");
    }

    // 2. Without Argument & With Return
    static int addNumbers() {
        int firstValue = 10;
        int secondValue = 20;

        return firstValue + secondValue;
    }

    // 3. With Argument & Without Return
    static void showSum(int firstNumber, int secondNumber) {
        int total = firstNumber + secondNumber;

        System.out.println("Sum : " + total);
    }

    // 4. With Argument & With Return
    static int calculateSum(int valueOne, int valueTwo) {
        int sumResult = valueOne + valueTwo;

        return sumResult;
    }

    public static void main(String[] args) {

        System.out.println("\n[1] WITHOUT ARGUMENT & WITHOUT RETURN");

        display();

        System.out.println("\n[2] WITHOUT ARGUMENT & WITH RETURN");

        int returnedValue = addNumbers();

        System.out.println("Sum : " + returnedValue);

        System.out.println("\n[3] WITH ARGUMENT & WITHOUT RETURN");

        showSum(15, 25);

        System.out.println("\n[4] WITH ARGUMENT & WITH RETURN");

        int finalResult = calculateSum(20, 30);

        System.out.println("Sum : " + finalResult);
    }
}
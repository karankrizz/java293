public class Day7P2 {

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {

        int sum = add(10, 20);
        System.out.println("Sum : " + sum);

        int product = multiply(10, 20);
        System.out.println("Product : " + product);

    }
}

// public class Day7P2 {

//     static int calculate(int num1, int num2) {
//         return num1 + num2;
//     }

//     static double calculate(double num1, double num2) {
//         return num1 + num2;
//     }

//     public static void main(String[] args) {

//         int intResult = calculate(10, 20);
//         System.out.println("Integer Result : " + intResult);

//         double doubleResult = calculate(10.5, 20.5);
//         System.out.println("Double Result : " + doubleResult);
//     }
// }
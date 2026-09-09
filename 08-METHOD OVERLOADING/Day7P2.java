// public class Day7P2 {

//     static int add(int num1, int num2) {
//         return num1 + num2;
//     }

//     static int multiply(int num1, int num2) {
//         return num1 * num2;
//     }

//     public static void main(String[] args) {

//         System.out.println("\n-----METHOD OVERLOADING-----");
//         System.out.println("\n ---SAME DATATYPE SAME PARAMETER BUT DIFFERENT METHOD NAME---");

//         int sum = add(10, 20);
//         System.out.println("Sum : " + sum);

//         int product = multiply(10, 50);
//         System.out.println("Product : " + product);


//     }
// }

public class Day7P2 {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

        static String add(String a,String b){
            return a+b;
        }

    public static void main(String[] args) {

           System.out.println("\n ---DIFFERENT DATATYPE SAME PARAMETER BUT SAME METHOD NAME---");


        int intResult = add(10, 20);
        System.out.println("Integer Result : " + intResult);

        double doubleResult = add(10.5, 20.5);
        System.out.println("Double Result : " + doubleResult);

            String stringResult =add("kirubha","karan");
            System.out.println("String Result : "+stringResult);
    }
}


// public class Day7P2 {

//     static int sub(int num1, int num2) {
//         return num1 - num2;
//     }

//     static double mul(double num1, double num2) {
//         return num1 * num2;
//     }

//     public static void main(String[] args) {

//            System.out.println("\n ---DIFFERENT DATATYPE SAME PARAMETER BUT DIFFERENT METHOD NAME---");


//         int intResult = sub(10, 20);
//         System.out.println("Integer Result : " + intResult);

//         double doubleResult = mul(10.5, 20.5);
//         System.out.println("Double Result : " + doubleResult);
//     }
// }
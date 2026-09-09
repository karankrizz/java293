public class Day7P4 {
    public static void main(String[] args) {
        
        System.out.println("\n WITHOUT EXCEPTION");
        // try {
        // int a = 10;
        // int b = 0;
        // int answer = a / b;
        // System.out.println(answer);
        // } catch (ArithmeticException e) {
        // System.out.println("Can not Divide by Zero");
        // }
        System.out.println("\n WITH EXCEPTION");
        // try {
        // int a = 10;
        // int b = 2;
        // int answer = a / b;
        // System.out.println(answer);
        // } catch (ArithmeticException e) {
        // System.out.println("Can not Divide by Zero");
        // }
        System.out.println("\n WITH EXCEPTION USING FINALLY");
        // try {
        // int a = 10;
        // int b = 0;
        // int answer = a / b;
        // System.out.println(answer);
        // } catch (ArithmeticException e) {
        // System.out.println("Can not Divide by Zero");
        // }
        // finally{
        // System.out.println("Program is completed");
        // }

        System.out.println("\n EXCEPTION ON ARRAY");
        // try {
        // int[] score = { 0, 12, 85, 97, 100 };
        // System.out.println(score[0]);
        // System.out.println(score[1]);
        // System.out.println(score[2]);
        // System.out.println(score[3]);
        // System.out.println(score[4]);
        // System.out.println(score[5]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Invalid Array Index");
        // }
        // finally{
        // System.out.println("program is finished ");
        // }
        System.out.println("\n EXCEPTION ON STRING VALUE NULL");

        // try {
        // String name = null;
        // System.out.println(name.length());
        // // System.out.println(name.toUpperCase());
        // } catch (NullPointerException e) {
        // System.out.println("String is NULL Value");
        // }
        System.out.println("\n EXCEPTION WHILE CONVERTING FROM STRING TO INTEGER");

        // try {
        // String check = "ABC";
        // int number = Integer.parseInt(check);
        // System.out.println(number);
        // } catch (NumberFormatException e) {
        // System.out.println("Invalid Number");
        // }

        System.out.println("\n EXCEPTION WHILE ASKING THE OUT OF BOUND INDEX ");

        try {
            String name = "Java";
            System.out.println(name.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid String Index");
        }

    }
}
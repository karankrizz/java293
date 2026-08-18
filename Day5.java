public class Day5 {
    public static void main(String[] args) {

        System.out.println("\n[1] STRING METHODS");

        String text = "Java Programming";

        System.out.println("Original String : " + text);
        System.out.println("Length          : " + text.length());
        System.out.println("Uppercase       : " + text.toUpperCase());
        System.out.println("Lowercase       : " + text.toLowerCase());
        System.out.println("Character       : " + text.charAt(2));
        System.out.println("Contains Java   : " + text.contains("Java"));

        System.out.println("\n[2] STRING METHODS");

        String word = "Programming";

        System.out.println("Substring : " + word.substring(0, 7));
        System.out.println("Replace   : " + word.replace("Programming", "Java"));
        System.out.println("Equals    : " + word.equals("Programming"));
        System.out.println("Starts With : " + word.startsWith("Pro"));
        System.out.println("Ends With   : " + word.endsWith("ing"));

        System.out.println("\n[3] STRING METHODS");

        String sentence = "  Java is Easy  ";

        System.out.println("Before Trim : " + sentence);
        System.out.println("After Trim  : " + sentence.trim());
        System.out.println("Is Empty    : " + sentence.isEmpty());
        System.out.println("Index of a  : " + sentence.indexOf("a"));

        System.out.println("\n[4] MATH METHODS");

        double number = 25.75;

        System.out.println("Round       : " + Math.round(number));
        System.out.println("Ceiling     : " + Math.ceil(number));
        System.out.println("Floor       : " + Math.floor(number));
        System.out.println("Square Root : " + Math.sqrt(number));

        System.out.println("\n[5] MATH METHODS");

        int num1 = 25;
        int num2 = 40;

        System.out.println("Maximum  : " + Math.max(num1, num2));
        System.out.println("Minimum  : " + Math.min(num1, num2));
        System.out.println("Absolute : " + Math.abs(-50));

        System.out.println("\n[6] POWER AND RANDOM");

        double base = 5;
        double exponent = 2;

        System.out.println("Power  : " + Math.pow(base, exponent));
        System.out.println("Random : " + Math.random());

        System.out.println("\n[7] MATH METHODS");

        double value = 49;

        System.out.println("Square Root : " + Math.sqrt(value));
        System.out.println("Cube        : " + Math.pow(value, 3));
        System.out.println("Round       : " + Math.round(15.6));
        System.out.println("Ceiling     : " + Math.ceil(15.2));
        System.out.println("Floor       : " + Math.floor(15.8));

    }
}
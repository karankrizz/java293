public class Day2 {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("               DAY 2 TASKS              ");
        System.out.println("========================================");

        System.out.println("\n[1] CELSIUS TO FAHRENHEIT");
        double celsius = 40.57;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("\nCelsius Value    : " + celsius + " °C");
        System.out.println("Fahrenheit Value : " + fahrenheit + " °F");

        System.out.println("\n[2] KM TO MILES");
        double kiloMeter = 15;
        double miles = kiloMeter * 0.62137119;
        System.out.println("\nKilometers : " + kiloMeter + " km");
        System.out.println("Miles       : " + miles + " mi");

        System.out.println("\n[3] SPEED, DISTANCE & TIME CALCULATOR");

        double distance = 150;
        double time = 3;
        double speed = distance / time;

        System.out.println("\nDistance : " + distance + " km");
        System.out.println("Time     : " + time + " hours");
        System.out.println("Speed    : " + speed + " km/h");

        System.out.println("\n[4] SALARY CALCULATOR");

        double monthlySalary = 50000;

        double yearlySalary = monthlySalary * 12;
        double dailySalary = yearlySalary / 365;
        double hourlySalary = dailySalary / 24;

        System.out.println("\nMonthly Salary : " + monthlySalary);
        System.out.println("Yearly Salary  : " + yearlySalary);
        System.out.println("Daily Salary   : " + dailySalary);
        System.out.println("Hourly Salary  : " + hourlySalary);

        System.out.println("\n[5] SIMPLE INTEREST CALCULATOR");

        double principal = 50000;
        double rate = 8;
        double numofyears = 3;

        double simpleInterest = (principal * rate * numofyears) / 100;
        double totalAmount = principal + simpleInterest;

        System.out.println("\nPrincipal Amount : " + principal);
        System.out.println("Interest Rate    : " + rate + "%");
        System.out.println("Time             : " + numofyears + " years");
        System.out.println("Simple Interest  : " + simpleInterest);
        System.out.println("Total Amount     : " + totalAmount);

        System.out.println("\n[6] AREA FORMULA");
        String choice = "1";
        switch (choice) {
            case "1":
                double side = 4;
                double square = side * side;
                System.out.println("AREA OF SQUARE: " + square);
                break;
            case "2":
                double length = 4;
                double breath = 8;
                double rectangle = length * breath;
                System.out.println("AREA OF RECTANGLE: " + rectangle);
                break;
            case "3":
                double radius = 4;
                double circle = (22.0 / 7.0) * radius * radius;
                System.out.println("AREA OF CIRCLE: " + circle);
                break;
            case "4":
                double base = 4;
                double height = 8;
                double triangle = 0.5 * base * height;
                System.out.println("AREA OF TRIANGLE: " + triangle);
                break;
            case "5":
                double parallelogramBase = 4;
                double parallelogramHeight = 8;
                double parallelogram = parallelogramBase * parallelogramHeight;
                System.out.println("AREA OF PARALLELOGRAM: " + parallelogram);
                break;

            default:
                System.out.println("Choose from (1,2,3,4,5)");
        }
        System.out.println("\n[7] VOWEL DETECTOR");
        char letter = 'A';
        char smallcase = Character.toLowerCase(letter);
        if (smallcase == 'a' || smallcase == 'e' || smallcase == 'i' || smallcase == 'o' || smallcase == 'u') {
            System.out.println(letter + " is a vowel ");
        } else {
            System.out.println("Its a consonant letter");
        }

        System.out.println("\n[8] LEAP YEAR CHECKER");

        int year = 2024;
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        System.out.println("\n[9] EB BILL CALCULATOR");

        int unitConsumed = 450;
        double bill;

        if (unitConsumed <= 200) {
            bill = 0;
        } else if (unitConsumed <= 400) {
            bill = (unitConsumed - 200) * 4.70;
        } else if (unitConsumed <= 500) {
            bill = (200 * 4.70) + ((unitConsumed - 400) * 6.30);
        } else {
            System.out.println("This calculator supports only up to 500 units.");
            return;
        }

        System.out.println("Units Consumed : " + unitConsumed);
        System.out.println("EB Bill        : Rs." + bill);

        System.out.println("\n[10] LARGEST OF 4 NUMBERS");

        int number1 = 72;
        int number2 = 45;
        int number3 = 72;
        int number4 = 31;

        if (number1 == number2 && number2 == number3 && number3 == number4) {
            System.out.println("All numbers are same");
        } else if (number1 >= number2 && number1 >= number3 && number1 >= number4) {
            System.out.println("Largest Number : " + number1);
        } else if (number2 >= number1 && number2 >= number3 && number2 >= number4) {
            System.out.println("Largest Number : " + number2);
        } else if (number3 >= number1 && number3 >= number2 && number3 >= number4) {
            System.out.println("Largest Number : " + number3);
        } else {
            System.out.println("Largest Number : " + number4);
        }

        System.out.println("\n[11] GRADING SYSTEM");

        int mark = 78;

        if (mark >= 91) {
            System.out.println("Grade : A1");
        } else if (mark >= 81) {
            System.out.println("Grade : A2");
        } else if (mark >= 71) {
            System.out.println("Grade : B1");
        } else if (mark >= 61) {
            System.out.println("Grade : B2");
        } else if (mark >= 51) {
            System.out.println("Grade : C1");
        } else if (mark >= 41) {
            System.out.println("Grade : C2");
        } else if (mark >= 35) {
            System.out.println("Grade : D - Pass");
        } else {
            System.out.println("Grade : E - Fail");
        }
        System.out.println("\n[12] VOTING ELIGIBILITY");

        String nationality = "Indian";
        int age = 21;

        if (nationality.equalsIgnoreCase("Indian")) {

            if (age >= 18) {
                System.out.println("Nationality : " + nationality);
                System.out.println("Age         : " + age);
                System.out.println("Result      : Eligible to Vote");
            } else {
                System.out.println("Nationality : " + nationality);
                System.out.println("Age         : " + age);
                System.out.println("Result      : Not Eligible - Age must be 18 or above");
            }

        } else {
            System.out.println("Nationality : " + nationality);
            System.out.println("Result      : Not Eligible - Indian citizens only");
        }
        System.out.println("\n[13] ADULT OR MINOR CHECK");

        int ag_e = 21;

        String result = ag_e >= 18 ? "Adult" : "Minor";

        System.out.println("Age    : " + ag_e);
        System.out.println("Result : " + result);
    }

}
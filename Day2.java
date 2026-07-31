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

    }

}
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
    }

}
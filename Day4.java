import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.time.Duration;
import java.util.Calendar;

public class Day4 {
    public static void main(String[] args) {



        System.out.println("\n[1] DATE");

        Date currentDate = new Date();
        System.out.println("Current Date : " + currentDate);

        System.out.println("\n[2] LOCAL DATE");

        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);

        System.out.println("\n[3] LOCAL TIME");

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time : " + currentTime);

        System.out.println("\n[4] LOCAL DATE TIME");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date & Time : " + dateTime);

        System.out.println("\n[5] DATE FORMATTER");

        LocalDate todayy = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.println("Format 1 : " + todayy.format(format1));
        System.out.println("Format 2 : " + todayy.format(format2));
        System.out.println("Format 3 : " + todayy.format(format3));

        System.out.println("\n[6] PERIOD");

        LocalDate startDate = LocalDate.of(2001, 1, 14);
        LocalDate endDate = LocalDate.now();

        Period age = Period.between(startDate, endDate);

        System.out.println("Years  : " + age.getYears());
        System.out.println("Months : " + age.getMonths());
        System.out.println("Days   : " + age.getDays());

        System.out.println("\n[7] DURATION");

        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(11, 30);

        Duration duration = Duration.between(startTime, endTime);

        System.out.println("Duration : " + duration.toHours() + " hours");

        System.out.println("\n[8] CALENDAR");

        Calendar calendar = Calendar.getInstance();

        System.out.println("Year  : " + calendar.get(Calendar.YEAR));
        System.out.println("Month : " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Day   : " + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("\n[9] CALENDAR ADD AND SET");

        Calendar date = Calendar.getInstance();

        System.out.println("Current Date : " + date.getTime());

        date.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("After 10 Days : " + date.getTime());

        date.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println("After Minus 5 Days from aug 28 : " + date.getTime());

        date.set(Calendar.YEAR, 2030);
        System.out.println("After Setting Year : " + date.getTime());
    }
}
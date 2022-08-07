import java.time.*;

public class DateTime {
    public void testLocalDateTime() {
        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month +" day: " + day +" seconds: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2022);
        System.out.println("date2: " + date2);
    }
    public void testZonedDateTime() {
        ZonedDateTime date1 = ZonedDateTime.parse("2022-08-06T10:15:30+05:30[Asia/Dhaka]");
        System.out.println("date1: " + date1);
        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);
    }
    public static void main(String args[]){
        DateTime dateTimeTester = new DateTime();
        dateTimeTester.testLocalDateTime();
        // zoned date time
        dateTimeTester.testZonedDateTime();
    }
}

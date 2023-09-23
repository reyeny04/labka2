import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("смещение часового пояса по Гринвичу: ");
        int timeZoneOffset = input.nextInt();

        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.setRawOffset(timeZoneOffset * 3600000);

        Calendar calendar = Calendar.getInstance(timeZone);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(calendar.getTime());

        System.out.print("Текущее время: " + currentTime);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сегодняшний день (0 - воскресенье, 1 - понедельник, ..., 6 - суббота): ");
        int today = scanner.nextInt();

        System.out.print("Введите количество дней после сегодняшнего для будущего дня: ");
        int days = scanner.nextInt();

        String[] daysOfWeek = {"воскресенье", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота"};

        int futureDay = (today + days) % 7;

        System.out.println("Сегодня " + daysOfWeek[today] + ", а будущий день - " + daysOfWeek[futureDay]);
    }
}

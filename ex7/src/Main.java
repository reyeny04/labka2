import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String secondString = scanner.nextLine();

        String commonPrefix = longestPrefix(firstString, secondString);
        if (!commonPrefix.isEmpty()) {
            System.out.println("Общая строка: " + commonPrefix);
        } else {
            System.out.println("Нет общих строк.");
        }
    }

    public static String longestPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefix.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return commonPrefix.toString();
    }
}

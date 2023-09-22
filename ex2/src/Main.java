import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        System.out.print("Введите число от 0 до 1000: ");
        int num = input.nextInt();

        if (num >= 0 && num <= 1000) {
            int digitSum = 0;

            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            System.out.println("Сумма чисел равна: " + digitSum);
        }
        else System.out.println("Сумма введена некорректно");
    }
}
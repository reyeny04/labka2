import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите целое число от 1 до 15: ");
        int n = input.nextInt();

        if (n >= 1 && n <= 15) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
        else System.out.println("Введенное число некорректно.");
    }
}

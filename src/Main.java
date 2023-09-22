import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму заказа: ");
        int price = input.nextInt();

        System.out.print("Введите сумму чаевых(%): ");
        int tip = input.nextInt();

        System.out.print("Общая сумма: " + (price + (tip * price / 100)));
    }

}
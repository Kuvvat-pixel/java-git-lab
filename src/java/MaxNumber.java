import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int third = scanner.nextInt();

        int max = Math.max(first, Math.max(second, third));

        System.out.println("Максимальное число: " + max);

        scanner.close();
    }
}
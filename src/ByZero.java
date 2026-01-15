import java.util.Scanner;

public class ByZero {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        try {
            int result = a / b;
            System.out.println("Результат деления: " + result);
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя!");
        }

        scanner.close();
    }
}

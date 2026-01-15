import java.util.Scanner;

public class ArrayEnd2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[10];
        int index = 0;

        System.out.println("Вводите значения (\"end\" для завершения):");

        try {
            while (true){
                String input = scanner.nextLine();

                if ("end".equalsIgnoreCase(input)){
                    System.out.println("Ввод завершён.");
                    break;
                }
                arr[index] = input;
                index++;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка: Больше 10 значений вводить нельзя.");
        }

        System.out.print("Введите индекс элемента для вывода (0-9): ");
        int i = scanner.nextInt();

        try {
            String value = arr[i];
            System.out.println("Элемент по индексу " + i + ": " + value);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка: индекс " + i + " вне диапазона массива!");
        }
        scanner.close();
    }
}

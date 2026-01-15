import java.util.Scanner;

public class ArrayEnd {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[10];
        int i = 0;

        System.out.println("Вводите значения (\"end\" для завершения):");

        try {
            while (true){
                String input = scanner.nextLine();

                if ("end".equalsIgnoreCase(input)){
                    System.out.println("Ввод завершен.");
                    break;
                }

                arr[i] = input;
                i++;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка: Больше 10 значений вводить нельзя.");
        }
        System.out.println("Содержимое массива:");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(j + ": " + arr[j]);
        }

        scanner.close();
    }
}

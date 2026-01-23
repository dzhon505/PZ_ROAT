import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberExt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого файла: ");
        String file1Name = scanner.nextLine();

        System.out.print("Введите имя второго файла: ");
        String file2Name = scanner.nextLine();

        List<String> numbers = new ArrayList<>();

        // Читаем файл1 и ищем числа
        try (BufferedReader reader = new BufferedReader(new FileReader(file1Name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (isInteger(word)) {
                        numbers.add(word);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла1: " + e.getMessage());
            return;
        }

        try (FileWriter writer = new FileWriter(file2Name)) {
            for (int i = 0; i < numbers.size(); i++) {
                writer.write(numbers.get(i));
                if (i < numbers.size() - 1) {
                    writer.write(" ");
                }
            }
            System.out.println(numbers);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл2: " + e.getMessage());
        }

        scanner.close();
    }

    private static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

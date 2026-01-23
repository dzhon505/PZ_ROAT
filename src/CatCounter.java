import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CatCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();
        scanner.close();

        try {
            // Считываем всё содержимое файла как одну строку
            String content = Files.readString(Paths.get(fileName));

            // Разделяем на слова по пробелам
            String[] words = content.split("\\s+");

            int count = 0;
            for (String word : words) {
                if ("cat".equals(word)) {
                    count++;
                }
            }

            System.out.println(count);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumberExt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя входного файла: ");
        String inputFile = scanner.nextLine();
        System.out.print("Введите имя выходного файла: ");
        String outputFile = scanner.nextLine();
        scanner.close();

        try {
            String content = Files.readString(Paths.get(inputFile));
            String[] words = content.split("\\s+");

            StringBuilder result = new StringBuilder();
            for (String word : words) {
                // Проверяем, состоит ли слово ТОЛЬКО из цифр и не пустое
                if (!word.isEmpty() && word.chars().allMatch(Character::isDigit)) {
                    if (result.length() > 0) {
                        result.append(" ");
                    }
                    result.append(word);
                }
            }

            Files.writeString(Paths.get(outputFile), result.toString());
            System.out.println("Результат записан в " + outputFile);
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
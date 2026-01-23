import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReverseFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя (или путь) первого файла: ");
        String file1Name = scanner.nextLine();

        System.out.print("Введите имя (или путь) второго файла: ");
        String file2Name = scanner.nextLine();

        Path path1 = Paths.get(file1Name);
        Path path2 = Paths.get(file2Name);

        try {
            byte[] data = Files.readAllBytes(path1);
            System.out.println("Прочитано байт из " + file1Name + ": " + data.length);

            for (int i = 0; i < data.length / 2; i++) {
                byte temp = data[i];
                data[i] = data[data.length - 1 - i];
                data[data.length - 1 - i] = temp;
            }

            Files.write(path2, data);
            System.out.println("Готово: " + file1Name + " → " + file2Name + " (обратный порядок)");

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }

        scanner.close();
    }
}

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReverseFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите имя входного файла: ");
            String inputFile = reader.readLine();
            System.out.print("Введите имя выходного файла: ");
            String outputFile = reader.readLine();

            // Чтение всех байтов из входного файла
            byte[] bytes = Files.readAllBytes(Paths.get(inputFile));

            // Разворот массива байтов
            for (int i = 0; i < bytes.length / 2; i++) {
                byte temp = bytes[i];
                bytes[i] = bytes[bytes.length - 1 - i];
                bytes[bytes.length - 1 - i] = temp;
            }

            // Запись в выходной файл
            Files.write(Paths.get(outputFile), bytes);

            System.out.println("Файл успешно записан в обратном порядке.");
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class CountDots {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            int ch;
            while ((ch = reader.read()) != -1){
                if (ch == '.'){
                    count++;
                }
            }
            System.out.println("Количество точек в файле: " + count);
        }catch (IOException e){
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
        scanner.close();
    }
}

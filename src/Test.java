import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();
        int dotCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            int ch;
            while ((ch = reader.read()) != -1){
                if (ch == '.'){
                    dotCount++;
                }
            }System.out.println(dotCount);
        }catch (IOException e){
            System.out.println("Error! " + e.getMessage());
            System.out.println("Hello");
        }
    }
}

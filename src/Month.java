import java.util.Scanner;

public class Month {
    public enum Months {
        ЯНВАРЬ(1),    ФЕВРАЛЬ(2),   МАРТ(3),      АПРЕЛЬ(4),
        МАЙ(5),       ИЮНЬ(6),      ИЮЛЬ(7),      АВГУСТ(8),
        СЕНТЯБРЬ(9),  ОКТЯБРЬ(10),  НОЯБРЬ(11),   ДЕКАБРЬ(12),
        ТРОА(13);

        private final int number;

        Months(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public static Months byNumber(int num) {
            for (Months month : Months.values()) {
                if (month.number == num) {
                    return month;
                }
            }
            throw new IllegalArgumentException("Номер месяца должен быть от 1 до 12");
        }
    }

    public static void main(String[] args) {  // + public
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца (1-12): ");
        int monthNumber = scanner.nextInt();

        try {
            Months month = Months.byNumber(monthNumber);

            switch (month) {
                case ЯНВАРЬ:
                    System.out.println("Январь");
                    break;
                case ФЕВРАЛЬ:
                    System.out.println("Февраль");
                    break;
                case МАРТ:
                    System.out.println("Март");
                    break;
                case АПРЕЛЬ:
                    System.out.println("Апрель");
                    break;
                case МАЙ:
                    System.out.println("Май");
                    break;
                case ИЮНЬ:
                    System.out.println("Июнь");
                    break;
                case ИЮЛЬ:
                    System.out.println("Июль");
                    break;
                case АВГУСТ:
                    System.out.println("Август");
                    break;
                case СЕНТЯБРЬ:
                    System.out.println("Сентябрь");
                    break;
                case ОКТЯБРЬ:
                    System.out.println("Октябрь");
                    break;
                case НОЯБРЬ:
                    System.out.println("Ноябрь");
                    break;
                case ДЕКАБРЬ:
                    System.out.println("Декабрь");
                    break;
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

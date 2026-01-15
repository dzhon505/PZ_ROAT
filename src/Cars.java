import java.util.*;

public class Cars {

    public enum Brand {
        TOYOTA("Тойота"),
        BMW("БМВ"),
        AUDI("Ауди"),
        KIA("Киа"),
        LADA("Лада");

        private final String russianName;

        Brand(String russianName) {
            this.russianName = russianName;
        }

        public String getRussianName() {
            return russianName;
        }
    }

    public enum Color {
        WHITE("Белый"),
        BLACK("Чёрный"),
        RED("Красный"),
        BLUE("Синий"),
        SILVER("Серебристый");

        private final String russianName;

        Color(String russianName) {
            this.russianName = russianName;
        }

        public String getRussianName() {
            return russianName;
        }
    }

    public enum Car {
        CAMRY("Camry", Brand.TOYOTA, 210, 3_000_000, Color.BLACK),
        COROLLA("Corolla", Brand.TOYOTA, 190, 2_000_000, Color.WHITE),
        A4("A4", Brand.AUDI, 240, 4_000_000, Color.SILVER),
        X5("X5", Brand.BMW, 250, 6_000_000, Color.BLUE),
        RIO("Rio", Brand.KIA, 180, 1_800_000, Color.RED);

        private final String model;
        private final Brand brand;
        private final int maxSpeed;      // км/ч
        private final int price;         // рубли
        private final Color color;

        Car(String model, Brand brand, int maxSpeed, int price, Color color) {
            this.model = model;
            this.brand = brand;
            this.maxSpeed = maxSpeed;
            this.price = price;
            this.color = color;
        }

        public String getModel() {
            return model;
        }

        public Brand getBrand() {
            return brand;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public int getPrice() {
            return price;
        }

        public Color getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Марка: " + brand.getRussianName() +
                    ", модель: " + model +
                    ", цвет: " + color.getRussianName() +
                    ", макс. скорость: " + maxSpeed + " км/ч" +
                    ", цена: " + price + " руб.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите максимальную сумму, которую вы готовы потратить: ");
        int maxBudget = scanner.nextInt();

        List<Car> availableCars = new ArrayList<>();

        for (Car car : Car.values()) {
            if (car.getPrice() <= maxBudget) {
                availableCars.add(car);
            }
        }

        if (availableCars.isEmpty()) {
            System.out.println("К сожалению, по вашему бюджету автомобилей нет.");
        } else {
            availableCars.sort(Comparator.comparingInt(Car::getMaxSpeed));

            System.out.println("Доступные автомобили:");
            for (Car car : availableCars) {
                System.out.println(car);
            }
        }

        scanner.close();
    }
}

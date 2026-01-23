public class Abstract {
    static abstract class Car {
        protected int maxSpeed;
        protected int releaseYear;

        public Car(int maxSpeed, int releaseYear) {
            this.maxSpeed = maxSpeed;
            this.releaseYear = releaseYear;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public abstract void carInfo();
    }

    static class SportsCar extends Car {
        public SportsCar(int maxSpeed, int releaseYear) {
            super(maxSpeed, releaseYear);
        }

        @Override
        public void carInfo() {
            System.out.println("Спортивная машина " + releaseYear +
                    " года, макс. скорость: " + maxSpeed + " км/ч");
        }
    }

    static class Truck extends Car {
        public Truck(int maxSpeed, int releaseYear) {
            super(maxSpeed, releaseYear);
        }

        @Override
        public void carInfo() {
            System.out.println("Грузовик " + releaseYear +
                    " года, макс. скорость: " + maxSpeed + " км/ч");
        }
    }

    static class ElectricCar extends Car {
        public ElectricCar(int maxSpeed, int releaseYear) {
            super(maxSpeed, releaseYear);
        }

        @Override
        public void carInfo() {
            System.out.println("Электромобиль " + releaseYear +
                    " года, макс. скорость: " + maxSpeed + " км/ч");
        }
    }

    public static void main(String[] args) {

        SportsCar sportsCar = new SportsCar(300, 2023);
        Truck truck = new Truck(120, 2018);
        ElectricCar tesla = new ElectricCar(250, 2024);

        System.out.println("=== Описание машин ===");
        sportsCar.carInfo();
        truck.carInfo();
        tesla.carInfo();

        System.out.println("\n=== Информация через геттеры ===");
        System.out.println("Спортивная: " + sportsCar.getMaxSpeed() +
                " км/ч, " + sportsCar.getReleaseYear() + " г.");
        System.out.println("Грузовик: " + truck.getMaxSpeed() +
                " км/ч, " + truck.getReleaseYear() + " г.");
    }
}

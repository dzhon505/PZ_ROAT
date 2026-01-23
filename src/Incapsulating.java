public class Incapsulating {
    static class Person {
        private String name;
        private int age;
        private double salary;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }

        public void setName(String name) {
                this.name = name;
        }


        public void setAge(int age) {
                this.age = age;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        public void printInfo() {
            System.out.println("Имя: " + name +
                    ", возраст: " + age +
                    ", зарплата: " + salary);
        }
    }

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Иван");
        person.setAge(25);
        person.setSalary(50000.0);


        System.out.println("Информация о человеке:");
        person.printInfo();

        System.out.println("\nОтдельно через геттеры:");
        System.out.println("Имя: " + person.getName());
        System.out.println("Возраст: " + person.getAge());
        System.out.println("Зарплата: " + person.getSalary());

    }
}

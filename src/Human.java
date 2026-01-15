public class Human {
    private String name;
    private String surname;
    private int birthYear;

    static int currentYear = 2025;

    public Human(String name, String surname, int birthYear){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public static void main(String[] args) {
        Human human = new Human("Ivan", "Kozlov", 1990);
        Human human1 = new Human("Denis", "Petrov", 1985);
        human.printInfo();
        human1.printInfo();
    }

    public void printInfo(){
        int age = currentYear - birthYear;
        System.out.println(surname + " " + name + " " + age + " лет.");
    }
}


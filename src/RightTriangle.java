import java.util.Scanner;

public class RightTriangle {
    private double cathet1;
    private double cathet2;
    private double hypotenuse;
    private double area;
    private double perimeter;

    public RightTriangle(double cathet1, double cathet2){
//        this.cathet1 = cathet1;
//        this.cathet2 = cathet2;
        setCathet1(cathet1);
        setCathet2(cathet2);
    }

    public void setCathet1(double cathet1){
        if (cathet1 <= 0) {
            throw new IllegalArgumentException("Катет 1 должен быть > 0");
        }
        this.cathet1 = cathet1;
    }

    public void setCathet2(double cathet2){
        if (cathet2 <= 0) {
            throw new IllegalArgumentException("Катет 2 должен быть > 0");
        }
        this.cathet2 = cathet2;
    }

    public double getCathet1() {
        return cathet1;
    }

    public double getCathet2() {
        return cathet2;
    }

    public void calculateHypotenuse() {
        hypotenuse = Math.hypot(cathet1, cathet2);
    }

    public void calculateArea(){
        area = (cathet1 * cathet2)/2;
    }

    public void calculatePerimeter(){
        perimeter = cathet1 + cathet2 + hypotenuse;
    }

    public void printInfo(){
        System.out.println("Катет 1 = " + cathet1);
        System.out.println("Катет 2 = " + cathet2);
        System.out.println("Гипотенуза = " + hypotenuse);
        System.out.println("Площадь треугольника = " + area);
        System.out.println("Периметр треугольника = " + perimeter);
    }

    public void printHypotenuse() {
        System.out.println("Гипотенуза = " + hypotenuse);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите катет 1: ");
        double c1 = scanner.nextDouble();

        System.out.print("Введите катет 2: ");
        double c2 = scanner.nextDouble();

        if (c1 <= 0 || c2 <= 0) {
            System.out.println("Ошибка, катет не может быть отрицательным.");
            return;
        }
        RightTriangle triangle = new RightTriangle(c1, c2);
        triangle.calculateHypotenuse();
        triangle.calculateArea();
        triangle.calculatePerimeter();
        triangle.printInfo();

        scanner.close();

    }
}

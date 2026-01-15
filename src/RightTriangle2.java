import java.util.Scanner;

public class RightTriangle2 {
    private double cathet1;
    private double cathet2;
    private double hypotenuse;

    public RightTriangle2(){

    }

    public double getCathet1(){
        return cathet1;
    }

    public void setCathet1(double cathet1) {
        this.cathet1 = cathet1;
    }

    public double getCathet2() {
        return cathet2;
    }

    public void setCathet2(double cathet2) {
        this.cathet2 = cathet2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public void calculateUnknownCathet(){
        if(hypotenuse <= 0) {
            throw new IllegalArgumentException("Гипотенуза должна быть > 0");
        }

        if(cathet1 > 0 && cathet2 == 0){
            cathet2 = Math.sqrt(hypotenuse * hypotenuse - cathet1 * cathet1);
        }else if (cathet2 > 0 && cathet1 == 0){
            cathet1 = Math.sqrt(hypotenuse * hypotenuse - cathet2 * cathet2);
        }else {
            throw new IllegalStateException("Должен быть задан ровно один катет");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        RightTriangle2 triangle2 = new RightTriangle2();

        System.out.print("ВВедите длину гипотенузы: ");
        double hyp = scanner.nextDouble();
        triangle2.setHypotenuse(hyp);

        System.out.print("Введите длину известного катета: ");
        double knownCathet = scanner.nextDouble();

        triangle2.setCathet1(knownCathet);

        triangle2.calculateUnknownCathet();

        System.out.println("Катет 1 = " + triangle2.getCathet1());
        System.out.println("Катет 2 = " + triangle2.getCathet2());
        System.out.println("Гипотенуза = " + triangle2.getHypotenuse());

        scanner.close();
    }
}

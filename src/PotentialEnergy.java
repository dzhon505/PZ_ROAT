import java.util.Scanner;

public class PotentialEnergy {
    private static double g = 9.8;
    private double h;
    private double m;

    public PotentialEnergy(){

    }

    public static double getG() {
        return g;
    }
    public static void setG(double g){
        PotentialEnergy.g = g;
    }

    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }

    public double getM() {
        return m;
    }
    public void setM(double m) {
        this.m = m;
    }

    public double calculateEnergy(){
        return m * g * h;
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PotentialEnergy pe = new PotentialEnergy();

        System.out.print("Введите массу тела (кг): ");
        double mass = scanner.nextDouble();
        pe.setM(mass);

        System.out.print("Введите высоту над землей (м): ");
        double height = scanner.nextDouble();
        pe.setH(height);

        double energy = pe.calculateEnergy();

        System.out.println("Потенциальная энергия = " + energy + " Дж");
        scanner.close();
    }
}

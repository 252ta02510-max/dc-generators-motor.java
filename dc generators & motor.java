import java.util.Scanner;

public class DCGeneratorsMotors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DC Generators & Motors");
        System.out.println("----------------------");

        System.out.print("Enter generated EMF (V): ");
        double Eg = sc.nextDouble();

        System.out.print("Enter armature current (A): ");
        double Ia = sc.nextDouble();

        System.out.print("Enter armature resistance (Ohms): ");
        double Ra = sc.nextDouble();

        double copperLoss = Ia * Ia * Ra;
        double generatedPower = Eg * Ia;

        System.out.println("\nDC Generator:");
        System.out.println("Copper Loss = " + copperLoss + " W");
        System.out.println("Generated Power = " + generatedPower + " W");

        System.out.print("\nEnter motor supply voltage (V): ");
        double V = sc.nextDouble();

        System.out.print("Enter motor armature current (A): ");
        double Im = sc.nextDouble();

        double motorPower = V * Im;
        double motorCopperLoss = Im * Im * Ra;
        double backEMF = V - (Im * Ra);

        System.out.println("\nDC Motor:");
        System.out.println("Back EMF = " + backEMF + " V");
        System.out.println("Input Power = " + motorPower + " W");
        System.out.println("Copper Loss = " + motorCopperLoss + " W");

        sc.close();
    }
}

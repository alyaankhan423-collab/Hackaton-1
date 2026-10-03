import java.util.Scanner;

public class TotalEnergy {

    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double morningEnergy = sc.nextDouble();
        double eveningEnergy = sc.nextDouble();

        double total = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total: " + total);

        sc.close();
    }
}
import java.util.Scanner;

public class EnergyMonitor { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        if (value >=10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Generation");
        }

        sc.close();
    }
}
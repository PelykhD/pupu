import java.util.Locale;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введіть три значення:");
        
        double t1 = scanner.nextDouble();
        double t2 = scanner.nextDouble();
        double t3 = scanner.nextDouble();
        
        double totalSpeed = (1.0 / t1) + (1.0 / t2) + (1.0 / t3);
        
        double totalTime = 1.0 / totalSpeed;
        
        System.out.printf("Час, необхідний для з'їдання пирога: %.2f годин\n", totalTime);
        
        scanner.close();
    }
}

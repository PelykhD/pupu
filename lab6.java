import java.util.Locale;
import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.printf(Locale.US, "%.6f\n", distance);
        
        scanner.close();
    }
}

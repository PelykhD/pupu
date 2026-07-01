import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть натуральне число n: ");
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        int count = 0;
        
        for (int r = 1; r * (r + 1) < n; r++) {
            if (n % r == 0) {
                count++;
            }
        }
        
        System.out.println("Кількість рівних дільників числа " + n + ": " + count);
        
        scanner.close();
    }
}

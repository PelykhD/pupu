import java.util.Scanner;

public class lab2 {
    
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int p = scanner.nextInt();
        
        long result = scanner.nextLong();
        
        for (int i = 1; i < p; i++) {
            long nextNumber = scanner.nextLong();
            result = lcm(result, nextNumber);
        }
        
        System.out.println(result);
        
        scanner.close();
    }
}

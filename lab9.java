import java.util.Scanner;

public class lab9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextLong()) return;
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        
        long diff = y - x;
        if (diff <= 0) {
            System.out.println(0);
            return;
        }
        
        long k = (long) Math.sqrt(diff);
        long steps;
        
        if (k * k == diff) {
            steps = 2 * k - 1;
        } else if (diff - k * k <= k) {
            steps = 2 * k;
        } else {
            steps = 2 * k + 1;
        }
        
        System.out.println(steps);
        
        scanner.close();
    }
}

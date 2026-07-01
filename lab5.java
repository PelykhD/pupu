import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть довжину послідовності n: ");
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Кількість шуканих послідовностей: 0");
            return;
        }
        
        int MOD = 12345;
        
        if (n == 1) {
            System.out.println("Кількість шуканих послідовностей: " + (2 % MOD));
            return;
        }
        if (n == 2) {
            System.out.println("Кількість шуканих послідовностей: " + (4 % MOD));
            return;
        }
        
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % MOD;
        }
        
        System.out.println("Кількість шуканих послідовностей: " + dp[n]);
        
        scanner.close();
    }
}

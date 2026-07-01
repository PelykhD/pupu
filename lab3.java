import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int p = scanner.nextInt();
        
        if (p <= 0) {
            System.out.println(0);
            return;
        }
        if (p == 1) {
            System.out.println(2);
            return;
        }
        if (p == 2) {
            System.out.println(4);
            return;
        }
        
        long[] A = new long[p + 1];
        long[] B = new long[p + 1];
        
        A[2] = 2;
        B[2] = 2;
        
        for (int i = 3; i <= p; i++) {
            A[i] = A[i - 1] + B[i - 1];
            B[i] = A[i - 1];
        }
        
        long total = A[p] + B[p];
        
        System.out.println(total);
        
        scanner.close();
    }
}

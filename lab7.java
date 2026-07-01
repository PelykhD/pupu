import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextLong()) return;
        long x1 = scanner.nextLong();
        long y1 = scanner.nextLong();
        long r1 = scanner.nextLong();
        long x2 = scanner.nextLong();
        long y2 = scanner.nextLong();
        long r2 = scanner.nextLong();
        
        long dSq = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        
        long rSumSq = (r1 + r2) * (r1 + r2);
        long rDiffSq = (r1 - r2) * (r1 - r2);
        
        if (dSq == 0 && r1 == r2) {
            System.out.println(-1);
        } else if (dSq > rSumSq || dSq < rDiffSq) {
            System.out.println(0);
        } else if (dSq == rSumSq || dSq == rDiffSq) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        
        scanner.close();
    }
}

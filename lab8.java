import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть слово: ");
        if (!scanner.hasNext()) return;
        String word = scanner.next().toLowerCase();
        
        int n = word.length();
        Map<Character, Integer> counts = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        
        long result = factorial(n);
        for (int count : counts.values()) {
            result /= factorial(count);
        }
        
        System.out.println("Кількість анаграм: " + result);
        
        scanner.close();
    }
    
    private static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}

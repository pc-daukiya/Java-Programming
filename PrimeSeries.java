import java.util.Scanner;

public class PrimeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = sc.nextInt();
        
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) System.out.print(num + " ");
        }
        sc.close();
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

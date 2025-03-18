import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        
        int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Greatest number: " + greatest);
        sc.close();
    }
}

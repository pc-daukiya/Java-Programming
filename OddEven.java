import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
        sc.close();
    }
}

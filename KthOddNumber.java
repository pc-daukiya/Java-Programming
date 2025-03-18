import java.util.Scanner;

public class KthOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int count = 0, oddNum = -1;
        boolean found = false;

        System.out.println("Enter numbers (Enter -1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break; // Exit on -1
            
            if (num % 2 != 0) { // Check if the number is odd
                count++;
                if (count == k) {
                    oddNum = num;
                    found = true;
                }
            }
        }

        if (found) 
            System.out.println("The " + k + "th odd number is: " + oddNum);
        else 
            System.out.println("Kth odd number not found in the given series.");

        sc.close();
    }
}

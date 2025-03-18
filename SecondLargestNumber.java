import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers (Enter -1 to stop):");

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        boolean found = false;

        while (true) {
            int num = sc.nextInt();
            if (num == -1) break; // Exit on -1

            if (num > first) {
                second = first;
                first = num;
                found = true;
            } else if (num > second && num != first) {
                second = num;
                found = true;
            }
        }

        if (second == Integer.MIN_VALUE) 
            System.out.println("Second largest number not found.");
        else 
            System.out.println("Second largest number: " + second);

        sc.close();
    }
}

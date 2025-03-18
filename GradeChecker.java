import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        int percentage = sc.nextInt();
        String grade;
        
        switch (percentage / 10) {
            case 10:
            case 9: grade = "A"; break;
            case 8: grade = "B"; break;
            case 7: grade = "C"; break;
            case 6: grade = "D"; break;
            case 5: grade = "E"; break;
            default: grade = "F (Fail)";
        }
        
        System.out.println("Grade: " + grade);
        sc.close();
    }
}

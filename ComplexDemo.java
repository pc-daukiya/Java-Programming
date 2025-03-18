import java.util.*;

class ComplexNumberSum {
    private int real;
    private int imaginary;

    public ComplexNumberSum(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumberSum add(ComplexNumberSum other) {
        return new ComplexNumberSum(this.real + other.real, this.imaginary + other.imaginary);
    }

    public void display() {
        System.out.println(real + " + i" + imaginary);
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        ComplexNumberSum num1 = new ComplexNumberSum(3, 2);
        ComplexNumberSum num2 = new ComplexNumberSum(9, 5);

        System.out.print("First Complex Number: ");
        num1.display();
        System.out.print("Second Complex Number: ");
        num2.display();

        ComplexNumberSum sum = num1.add(num2);

        System.out.print("Sum of Complex Numbers: ");
        sum.display();
    }
}

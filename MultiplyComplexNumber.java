import java.util.Scanner;

class MultiplyComplexNumber {
    double real, imag;

    MultiplyComplexNumber(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    MultiplyComplexNumber multiply(MultiplyComplexNumber other) {
        double realPart = (this.real * other.real) - (this.imag * other.imag);
        double imagPart = (this.real * other.imag) + (this.imag * other.real);
        return new MultiplyComplexNumber(realPart, imagPart);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first complex number: ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        MultiplyComplexNumber num1 = new MultiplyComplexNumber(real1, imag1);

        System.out.print("Enter real and imaginary part of second complex number: ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();
        MultiplyComplexNumber num2 = new MultiplyComplexNumber(real2, imag2);

        MultiplyComplexNumber result = num1.multiply(num2);

        System.out.print("Product: ");
        result.display();

        sc.close();
    }
}

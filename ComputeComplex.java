import java.util.Scanner;

public class ComputeComplex {
    public static void main(String[] args)
	{
        double real,imaginary;
        System.out.println("Enter the complex number1 (realPart imaginaryPart): ");
        try (Scanner sc = new Scanner(System.in)) {
			real = sc.nextDouble();
			imaginary = sc.nextDouble();
			Complex C1 = new Complex(real, imaginary);
			C1.printComplexNumber();
			System.out.println("Enter the complex number2 (realPart imaginaryPart): ");
			real = sc.nextDouble();
			imaginary = sc.nextDouble();
			Complex C2 = new Complex(real, imaginary);
			C2.printComplexNumber();
			Complex C3 = new Complex();
			C3 = C3.addComp(C1, C2);
			System.out.print("Sum of ");
			C3.printComplexNumber();
			C3 = C3.subtractComp(C1, C2);
			System.out.print("Difference of ");
			C3.printComplexNumber();
		}
	}

}

public class Complex {

	double realPart, imaginaryPart;

	Complex()
	{
	}

	Complex(double real, double imaginary)
	{
		realPart = real;
		imaginaryPart = imaginary;
	}

	Complex addComp(Complex C1, Complex C2)
	{
		Complex temp = new Complex();

		temp.realPart = C1.realPart + C2.realPart;

		temp.imaginaryPart = C1.imaginaryPart + C2.imaginaryPart;

		return temp;
	}

	Complex subtractComp(Complex C1, Complex C2)
	{
		Complex temp = new Complex();

		temp.realPart = C1.realPart - C2.realPart;

		temp.imaginaryPart = C1.imaginaryPart - C2.imaginaryPart;

		return temp;
	}

	void printComplexNumber()
	{
		System.out.println("Complex number: " + realPart + " + " + imaginaryPart + "i");
	}
}
import java.util.Scanner;

public class math{
	public static void sum(double value1, double value2) {
		double result = value1 + value2;
		System.out.println("The sum is: ");
		System.out.println(result);
		
	}
	public static void subtraction(double value1, double value2) {
		double result = value1 - value2;
		System.out.println("The subtraction is: ");
		System.out.println( result);
	}
	public static void multiplication(double value1, double value2) {
		double result = value1 * value2;
		System.out.println("The multiplication is: ");
		System.out.println( result);
	}
	public static void division(double value1, double value2) {
		double result = value1 / value2;
		System.out.println("The division is: ");
		System.out.printf("%.2f",result);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		double value1, value2;
		System.out.println("ENTER THE FIRST VALUE: ");
		value1 = read.nextDouble();
		System.out.println("ENTER THE SECOND VALUE: ");
		value2 = read.nextDouble();
		math.sum(value1, value2);
		math.subtraction(value1, value2);
		math.multiplication(value1, value2);
		math.division(value1, value2);
	};
	
};


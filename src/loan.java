import java.lang.Math;
import java.util.Scanner;


public class loan{
	public static void loanValue(double value, double rateValue, int time) {
		double valueTotal = value * (1+ Math.pow((rateValue/100),time));
		double fees = valueTotal - value;
		System.out.println("The total value of the loan is: ");
		System.out.printf("%.2f", valueTotal);
		System.out.println("\nThe value of the fees is: ");
		System.out.printf("%.2f",fees);
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		double value, rateValue;
		int time;
		System.out.println("ENTER THE VALUE OF THE LOAN: ");
		value = read.nextDouble();
		System.out.println("ENTER THE RATE VALUE: ");
		rateValue = read.nextDouble();
		System.out.println("ENTER THE TIME OF THE LOAN: ");
		time = read.nextInt();
		loan.loanValue(value, rateValue, time);
	};

}

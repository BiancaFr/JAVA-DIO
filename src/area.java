import java.lang.Math;
import java.util.Scanner;

public class area{
	public static void calculateArea(double edge) {
		double areaTotal = Math.pow(edge,2);
		System.out.println("The value of the area of ​​the square is: ");
		System.out.printf("%.2f", areaTotal);
	};
	//using overload
	public static void calculateArea(double base, double height) {
		double areaTotal = (base* height) /2;
		System.out.println("The value of the area of ​​the triangle is: ");
		System.out.printf("%.2f", areaTotal);
	};
	//using overload
	public static void calculateArea(double largerBase, double base2, double height) {
		double areaTotal = ((largerBase + base2) * height) /2;
		System.out.println("The value of the area of ​​the trapeze is: ");
		System.out.printf("%.2f", areaTotal);
	};
	public static void calculateAreaR(double base, double height) {
		double areaTotal = (base* height) /2;
		System.out.println("The value of the area of ​​the rectangle is: ");
		System.out.printf("%.2f", areaTotal);
	};
	public static void calculateAreaC(double radius) {
		double areaTotal = 3.14 * Math.pow(radius,2);
		System.out.println("The value of the area of ​​the circle is: ");
		System.out.printf("%.2f", areaTotal);
	};
	public static void menu() {
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		int option1 =0;
		double edge, base, largerBase, base2, height, radius;
		System.out.println(">> Calculating areas <<\r\n"
				+ "\r\n"
				+ "Enter the number of the desired option:\r\n"
				+ "\r\n"
				+ "1- Square\r\n"
				+ "2- Triangle\r\n"
				+ "3- Trapezius\r\n"
				+ "4- Rectangle\r\n"
				+ "5- Circle\n");
		
		option1 = read.nextInt();
		if (option1 == 1){
			System.out.println("ENTER THE SQUARE EDGE VALUE: ");
			edge = read.nextDouble();
			area.calculateArea(edge);
			area.option();
		}
		else if(option1 == 2){
			System.out.println("ENTER THE TRIANGLE BASE VALUE: ");
			base = read.nextDouble();
			System.out.println("ENTER THE TRIANGLE HEIGHT VALUE: ");
			height = read.nextDouble();
			area.calculateArea(base, height);
			area.option();
		}
		else if(option1 == 3){
			System.out.println("ENTER THE TRAPEZE LERGER BASE VALUE: ");
			largerBase = read.nextDouble();
			System.out.println("ENTER THE TRAPEZE SMALLER BASE VALUE: ");
			base2 = read.nextDouble();
			System.out.println("ENTER THE TRAPEZE HEIGHT VALUE: ");
			height = read.nextDouble();
			area.calculateArea(largerBase,base2, height);
			area.option();
		}
		else if(option1 == 4){
			System.out.println("ENTER THE RECTANGLE BASE VALUE: ");
			base = read.nextDouble();
			System.out.println("ENTER THE RECTANGLE HEIGHT VALUE: ");
			height = read.nextDouble();
			area.calculateAreaR(base, height);
			area.option();
		}
		if (option1 == 5){
			System.out.println("ENTER THE CIRCLE RADIUS VALUE: ");
			radius = read.nextDouble();
			area.calculateAreaC(radius);
			area.option();
		}
		
	};
	public static void option() {
		int option2;
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		System.out.println("\nDo you want to calculate another area? [1- YES] or [2- NO]");
		option2 = read.nextInt();
		if(option2 == 1) {
			area.menu();
		}
		else {
			System.out.println(" FINISH =D ");
	        System.exit(0);
		}
		
	}
	public static void main(String[] args) {
		area.menu();
	};
};

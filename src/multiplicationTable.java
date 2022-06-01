import java.util.Scanner;

public class multiplicationTable {
	public static void operation() {
		int number, i;
		System.out.println("What number do you want the multiplication table? ");
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		number = read.nextInt();
		System.out.println("multiplication table of "+ number +"\n");
		for(i =1; i<=10;i++) {
			System.out.println(number + " X " + i + " = " + (number*i));
		}
		multiplicationTable.option();

	}
	public static void option() {
		int option2;
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		System.out.println("\nDo you want to see another multiplication table? [1- YES] or [2- NO]");
		option2 = read.nextInt();
		if(option2 == 1) {
			multiplicationTable.operation();
		}
		else {
			System.out.println(" FINISH =D ");
	        System.exit(0);
		}
	}
	public static void main(String[] args) {
		multiplicationTable.operation();
	}
	

}

import java.util.Calendar;


public class days {
	public static void mensage() {
		Calendar day = Calendar.getInstance();
		System.out.println(day.getTime());
		int hour = day.get(Calendar.HOUR_OF_DAY);
		
		if(hour < 12) {
			System.out.println("Good Morning!");
		}
		else if(hour >= 12 && hour < 18) {
			System.out.println("Good Afternoon!");
		}
		else {
			System.out.println("Good Evening");
		}
	}
	public static void main(String[] args) {
		days.mensage();
	};


};


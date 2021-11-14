import java.util.Scanner;

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	
		getCarDetails();
	}
	
	static void getCarDetails() {
		System.out.println("Enter make");
		String make = input();
		System.out.println("Enter model");
		String model = input();
		System.out.println("Enter year");
		
		int year = 0;
		try {
			year = Integer.parseInt(input());
		}catch(Exception e) {
			System.out.println("Year can only be a numeric value.");
			getCarDetails();
			return;
		}
		Car c = new Car(make, model, year);
		
		System.out.println("Car details: " + c);
		
		sc.close();
	}
	
	static String input() {
		String in = sc.nextLine();	
		return in;
	}
	
}

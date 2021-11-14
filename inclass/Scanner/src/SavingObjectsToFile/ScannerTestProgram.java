package SavingObjectsToFile;

import java.io.*;
import java.util.*;

import javax.imageio.stream.FileCacheImageInputStream;

public class ScannerTestProgram {
	static Scanner sc = new Scanner(System.in);
	static List<Car> cars = new ArrayList<Car>();
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\611041\\Desktop\\cars.txt");
		if(f.isFile() && f.canRead()) {
			try {
				FileInputStream fileInput = new FileInputStream(f);
				ObjectInputStream s = new ObjectInputStream(fileInput);
				cars = (List<Car>) s.readObject();
				fileInput.close();
				s.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		mainMenu();
	}
	
	static void mainMenu() {
		System.out.println("1. List details \n"
				+ "2. Create a new car \n"
				+ "3. Exit");
		int input = sc.nextInt();
		if(input == 1) listInfo();
		if(input == 2) getMake();
		if(input == 3) exit();
	}
	
	static void listInfo() {
		System.out.println("You have " + cars.size() + "\n" + cars + "\n"
				+ "Main Menu? Y/N");
		
		String input = sc.next();
		if(input.equalsIgnoreCase("y")) mainMenu();
		
	}
	
	static void getMake() {
		System.out.println("Enter make");
		String make = sc.next();
		if(make.isEmpty() || make.isBlank()) {
			System.out.println("Make cannot be empty.");
				getMake(); 
			}else {
				getModel(make);
			}
		
	}
	
	static void getModel(String make) {
		System.out.println("Enter model");
		String model = sc.next();
		if(model.isEmpty() || model.isBlank()) {
			System.out.println("Model cannot be empty.");
				getModel(make); 
			}else {
				getYear(make, model);
			}
	}
	
	static void getYear(String make, String model) {
		System.out.println("Enter year");
		int year = 0;
		try {
			year = Integer.parseInt(sc.next());
		}catch(Exception e) {
			System.out.println("Year must be a number.");
			getYear(make, model);
			return;
		}
		Car c = new Car(make, model, year);
		cars.add(c);
		mainMenu();
	}
	
	static void exit() {
		sc.close();
		
		try {
		FileOutputStream output = new FileOutputStream("C:\\Users\\611041\\Desktop\\cars.txt");
		ObjectOutputStream objectout = new ObjectOutputStream(output);
		objectout.writeObject(cars);
		
		output.close();
		objectout.close();
		}catch(Exception e) {
			
		}
		
		System.exit(0);
	}
}

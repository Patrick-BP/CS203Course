import Package2.*;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Number of classes per week: " + ClassStartTimes.numberOfClassesPerSchoolDayExceptHolidaysAndWeekends + " Classes, " +
		"Morning class starts at: " + ClassStartTimes.morningClass() + " AM " + 
		"Afternoon class starts at: " + ClassStartTimes.afternoonClass() + " PM.");
		ClassStartTimes s = new ClassStartTimes();
		//System.out.println("SOME INT: " + s.someInt);
		double a = 3;
		double b = 4;
		double c = 5;
		//System.out.println(Math.PI * Math.round(3.25));
		
		
		
		int x = 16;
		Integer y = x;
		int z = 5;
		
		String myInt = "15";
		//System.out.println(Integer.compare(z, x-11));
		float f = x;
		//16      -> 16.0		
		System.out.println();
	}

}

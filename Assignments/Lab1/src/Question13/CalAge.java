package Question13;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.Scanner;


public class CalAge {
    private int currentYear = Year.now().getValue();
    private int currentMonth = MonthDay.now().getMonthValue();
    private int day, year;
    private double month;
    private String name;

    public CalAge(int day, double month, int year, String name) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double calculateAge(){
        double age = (currentYear - this.year) + ((currentMonth - month)/10) ;
        return age;
    }
    public static boolean checkDayOfBirth(){
        Scanner key  = new Scanner(System.in);
        System.out.println("Enter your day of Birth");
        int day = key.nextInt();
        System.out.println("Enter the month of Birth");
        double month = key.nextInt();
        System.out.println("Enter the year of Birth");
        int year = key.nextInt();
        if(CalAge.checkDayOfBirth()) {

        }else
            System.out.println("Invalid input");
        return true;
    }
}

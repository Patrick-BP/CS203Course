package Question15;

import java.time.MonthDay;
import java.time.Year;

public class CalAge {
    private int currentYear = Year.now().getValue();
    private int currentMonth = MonthDay.now().getMonthValue();
    private int day, year;
    private double month;


    public CalAge(int day, double month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public void setDay(int day) {this.day = day;}
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public double calculateAge(){
        double age = (currentYear - this.year) + ((currentMonth - month)/12) ;
        return age;
    }

}

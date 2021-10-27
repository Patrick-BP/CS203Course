package Question13;

import java.util.Scanner;

public class CalAgeMain {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("enter the day of Birth");
        int day = (key.nextInt() > 31)? 1 : key.nextInt();
        System.out.println("enter the month of Birth");
        double month = (key.nextInt() >12)? 1 : key.nextInt();;
        System.out.println("enter the year of Birth");
        int year = key.nextInt();

        CalAge person1 = new CalAge(day, month, year);
        System.out.println("You are : " +person1.calculateAge()+ " years old");

    }


}

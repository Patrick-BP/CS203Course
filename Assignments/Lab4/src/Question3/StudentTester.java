package Question3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentTester {
    public static void main(String[] args) {
        Comparable std1 = new Student("Bihizi",1237);
        Comparable std2 = new Student("Smith",1235);
        Comparable std3 = new Student("Williams",1236);
        List<Comparable> stdList = new ArrayList<>();
        stdList.add(std1);
        stdList.add(std2);
        stdList.add(std3);
        Collections.sort(stdList);
        System.out.println(stdList);


    }
}
/*

Sorting using IdNumber:

Output:
[Student{lastName='Smith', idNumber=1235}, Student{lastName='Williams', idNumber=1236}, Student{lastName='Bihizi', idNumber=1237}]

sorting using LastName:

Output
[Student{lastName='Bihizi', idNumber=1237}, Student{lastName='Smith', idNumber=1235}, Student{lastName='Williams', idNumber=1236}]
        */
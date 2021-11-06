package MidTermExam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> studList = new ArrayList<>();
        Student gstud1 = new GradStudent("paula",37,96,90.4);
        Student gstud2 = new GradStudent("paul",30,56,69.4);
        Student undStd1 = new UndergradStudent("chadia",17,79,89.5);
        Student undStd2 = new UndergradStudent("chani",26,70,88.5);

        studList.add(gstud1);
        studList.add(gstud2);
        studList.add(undStd1);
        studList.add(undStd2);

        for (Student e: studList) {

            System.out.println(e + " ,");

        }

        System.out.println(gstud1.equals(gstud2));

        Collections.sort(studList, new GradStudent());
    }

}

package MidTermExam;

import com.sun.jdi.NativeMethodException;

import java.util.Comparator;

public abstract class Student implements Comparator<Student>{
    private String name;
    private int age;
    private double testScore;

    public Student() {
        name = "unknown";
        age = 18;
        testScore = 0;
    }

    public Student(String name, int age, int testScore) {
        this.name = name;
        this.age = age;
        this.testScore = testScore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getTestScore() {
        return testScore;
    }

    abstract String computeLetterGrade();

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if(!(obj instanceof Student)) return false;
        Student std = (Student) obj;
        return name.equals(std.name) && age == std.age;
    }
}

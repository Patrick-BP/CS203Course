package MidTermExam;

public class GradStudent extends Student{
    private double majorProjectScore;

    public GradStudent() {
        super();
        this.majorProjectScore = 0;
    }

    public GradStudent(String name, int age, int testScore, double majorProjectScore) {
        super(name, age, testScore);
        this.majorProjectScore = majorProjectScore;
    }

    @Override
    String computeLetterGrade() {
        double avg = (majorProjectScore + super.getTestScore())/2;
        if (avg > 95) return "A+";
        else if (avg > 85) return "A";
        else if(avg > 75) return "B";
        else return "NC";

    }

    @Override
    public String toString() {
        return "GradStudent: " +
                 super.getName()+ " "+ computeLetterGrade();
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.getTestScore() - o2.getTestScore());
    }
}

package MidTermExam;

public class UndergradStudent extends Student{
    private double minorProjectScore;

    public UndergradStudent() {
        super();
        this.minorProjectScore = 0;
    }

    public UndergradStudent(String name, int age, int testScore, double minorProjectScore) {
        super(name, age, testScore);
        this.minorProjectScore = minorProjectScore;
    }

    @Override
    String computeLetterGrade() {
        double avg = (minorProjectScore + super.getTestScore())/2;
        if (avg > 90) return "A+";
        else if (avg > 85) return "A";
        else if(avg > 70) return "B";
        else return "NC";

    }

    @Override
    public String toString() {
        return "UndergradStudent: " +
                 super.getName() +" "+ computeLetterGrade();
    }


    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.getTestScore() - o2.getTestScore());
    }
}

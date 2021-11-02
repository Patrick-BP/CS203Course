package Question17;

public class Grading {
    private double quize1;
    private double quize2;
    private double quize3;
    private double midterm;
    private double finalExam;

    public Grading(double quize1, double quize2, double quize3, double midterm, double finalExam) {
        this.quize1 = quize1;
        this.quize2 = quize2;
        this.quize3 = quize3;
        this.midterm = midterm;
        this.finalExam = finalExam;
    }

    public double getQuize() {
        return ((quize1+quize2+quize3)/30)*25;
    }

    public double getMidterm() {
        return (midterm/100)*35;
    }

    public double getFinalExam() {
        return (finalExam/100)*40;
    }
    public char CalFinalGrade(){
        double finalGrade = getQuize()+getMidterm()+getFinalExam();
        if(finalGrade >=90) return 'A';
        else if(finalGrade >=80 )  return 'B';
        else if(finalGrade >=70) return 'C';
        else if(finalGrade >=60) return 'D';
        else return 'F';

    }



    @Override
    public String toString() {
        return
                "\nquize= " + getQuize() + " / 25"+
                "\nmidterm= " + getMidterm()+" / 35"+
                "\nfinalExam= " + getFinalExam()+" / 40";
    }
}

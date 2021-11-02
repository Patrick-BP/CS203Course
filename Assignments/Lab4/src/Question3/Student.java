package Question3;

public class Student implements Comparable<Student>{
    private String lastName;
    private int idNumber;

    public Student() {
        this.lastName = "unknown";
        this.idNumber = 0000;
    }

    public Student(String lastName, int idNumber) {
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }


    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        if(this.idNumber < o.idNumber) return -1;
//        if(this.idNumber > o.idNumber) return 1;
//        return 0;
//    }
    @Override
    public int compareTo(Student o) {
        if(this.lastName.charAt(0)< o.lastName.charAt(0)  ) return -1;
        if(this.lastName.charAt(0) > o.lastName.charAt(0)  ) return 1;
        return 0;
    }
}

package Question4;

public class Employee {
    private int employeeId;
    private String name,department,position;
    private double salary;

    public Employee(int employeeId, String name, String department, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double addBonus(){
        return salary + 200;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false ;
        if(!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return position.equals(e.position);
    }

    public String printEmployeeDetails(){
        return "" +getEmployeeId()+ "\n" + getName()+ "\n" + getDepartment()+ "\n" + addBonus() + "\n"+ getPosition();
    }


}

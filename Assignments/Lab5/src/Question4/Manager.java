package Question4;

public class Manager extends Employee{
    public Manager(int employeeId, String name, String department, String position, double salary) {
        super(employeeId, name, department, position, salary);
    }

    @Override
    public double addBonus() {
        return super.addBonus() + 300;
    }


}

package Question4;

public class Clerk extends Employee{
    public Clerk(int employeeId, String name, String department, String position, double salary) {
        super(employeeId, name, department, position, salary);
    }

    @Override
    public double addBonus() {
        return super.addBonus() + 100;
    }
}

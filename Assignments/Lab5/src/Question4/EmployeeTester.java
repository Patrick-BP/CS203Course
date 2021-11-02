package Question4;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee emp1 = new Manager(1234,"patrick","IT","manager",500);
        Employee emp2 = new Clerk(1235,"paul","HR","clerk",300);
        Employee emp3 = new Clerk(1236,"john","IT","clerk",300);

        System.out.println(emp1.printEmployeeDetails());
        System.out.println(emp1.equals(emp3));
    }


}

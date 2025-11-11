package Challenge.kgcoding.EmployeeDetails;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Sohail","45","900000");
        System.out.println(emp.getEmployeeDetails());
        emp.setAge("20");
        System.out.println(emp.getEmployeeDetails());

    }
}

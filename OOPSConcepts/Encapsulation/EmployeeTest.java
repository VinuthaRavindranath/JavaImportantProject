package OOPSConcepts.Encapsulation;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Vinutha";
        emp.employeeId=123;
        emp.setSalary(123.670);
        double sal=emp.getSalary();

        System.out.println(emp.name);
        System.out.println(emp.employeeId);
        System.out.println(sal);

        
    }
    
}

package OOPSConcepts.Encapsulation;

/**
 * Encapsulation in Java is a process of wrapping code and data together into a single unit
 encapsulation in java
We can create a fully encapsulated class in Java by making all the data members of the class private. 
Now we can use setter and getter methods to set and get the data in it.
It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
 */

public class Employee {

    public String name;
    public int employeeId;
    public double salary;


    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }
    
}

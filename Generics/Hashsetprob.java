import java.util.HashSet;
class Employee{
    long id;
    String name;
    double salary;
    String dept;
    public Employee(long id,String name,double salary,String dept){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    public void displayDetails(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee Department: "+dept);
    }
}
public class Hashsetprob {
    public static void main(String[] args){
        HashSet<Employee>  hashSet= new HashSet<>();
        hashSet.add(new Employee(1L, "Ananya", 100000, "QA"));
        hashSet.add(new Employee(12L, "Anagha", 90000, "R&D"));
        hashSet.add(new Employee(123L, "Anandita", 150000, "Maintainence"));
        hashSet.add(new Employee(1234L, "Anav", 30000, "PR"));
        
        for(Employee employee:hashSet){
            employee.displayDetails();
        }
    }
}

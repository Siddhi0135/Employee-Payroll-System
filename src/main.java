import java.util.ArrayList;

abstract class Employee{
    private String name;
    private int id;

//constructor creation
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
//encapsulation
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public abstract double calculateSalary();
    //override

    public String toString(){
        return "Employee[name="+name+", id="+id+", salary="+calculateSalary()+"]";
    }
}

class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary){
        //in order to run the super class constructor we did the below line of code
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    //override
    public double calculateSalary(){
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    //constructor creation
    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    //override
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
}

class PayrollSystem{
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeRemove = null;
        for(Employee employee : employeeList){
            if(employee.getId()==id){
                employeeRemove = employee;
                break;
            }
        }
        if(employeeRemove != null){
            employeeList.remove(employeeRemove);
        }
    }

    public void displayEmployees(){
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }

}

public class main{
    public static void main(String[] args){
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Siddhi", 1, 70000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Mani", 2, 40, 100);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial employee details");
        payrollSystem.displayEmployees();
        System.out.println("Removing Employees");
        payrollSystem.removeEmployee(2);
        System.out.println("Remaining Employees Details");
        payrollSystem.displayEmployees();

    }
}
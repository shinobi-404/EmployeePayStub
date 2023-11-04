


// import liabaries 
import java.util.ArrayList;
import java.util.Collections;

public class EmployeesPayList{
    public static void main(String[] args) {
        Employee emp1=new Employee(111,"Jimmy Dean",5256.32,0);
        Employee emp2=new Employee(598,"Jen Johnson",47370,5);
        Employee emp3=new Employee(920,"Jan Jones",47834.25,1);
        System.out.println(emp1.equals(emp3));
        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        //sort call goes here... 

        Collections.sort(list);
        
        for(Employee e:list)
            System.out.println(e);
    }
}

// class for employees 
class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private double salary;
    private int numberOfDependents;


    // mathical equation for salary 
    public double getNetSalary() {
        return this.salary * 0.91 + (this.numberOfDependents * 0.01 * this.salary);
    }

    public boolean equals(Object i) {
        if (i instanceof Employee)
            return this.getNetSalary() == ((Employee) i).getNetSalary();
        return false;
    }

    @Override
    public int compareTo(Employee i) {
        if(this.getNetSalary()<i.getNetSalary())
            return -1;
        else if(this.getNetSalary()>i.getNetSalary())
            return 1;
        return 0;
    }
    // constructors 
    public Employee(int id, String name, double salary, int numberOfDependents) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.numberOfDependents = numberOfDependents;
    }
// setters and getters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberOfDependents() {
        return numberOfDependents;
    }

    public void setNumberOfDependents(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }

    // user output display ... used string.format function to round salary to 2 decimal places
    @Override
    public String toString() {
        return "["+this.id+", "+this.name+", "+String.format("%.2f",this.getNetSalary())+"]";
    }
    
}
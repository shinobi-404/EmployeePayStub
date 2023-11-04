

public class EmployeePayStub {

    public static void main(String[] args) {

        String fullName = "Erika T. Jones";
        String employeeNumber = "ej789";
        double payRate = 100.0, hoursWorked = 1.0; 
        //TA will change these to test your code
        
        Employee e;
        e = new Employee(fullName, employeeNumber, payRate, hoursWorked);
        
        System.out.println(e); // To Test your toString method
        
        e.printCheck();
        
        System.out.println("Bye!");
        
    }
    
}
    //____________________________
    class Employee {
    // Your code goes here

    // private keeps data type within only the class 
        private String fullName;
        private String employeeNumber;
        private double payRate;
        private double hoursWorked;
        

        //setters and getters for every data type for all data types within the class 
        public String getFullName(){
            return fullName;
        }
        public void setFullName(String fullName){
            this.fullName = fullName;
        }
        public String getEmployeeNumber(){
            return employeeNumber;
        }
        public void setEmployeeNumber(String employeeNumber){
            this.employeeNumber = employeeNumber;
        }
        public double getPayRate(){
            return payRate;
        }
        public void setPayRate(double payRate){
            this.payRate = payRate;
        }
        public double getHoursWorked(){
            return hoursWorked;
        }
        public void setHoursWorked(double hoursWorked){
            this.hoursWorked = hoursWorked;
        }

        public Employee (String fullName, String employeeNumber, double payRate, double hoursWorked){
            this.fullName = fullName;
            this.employeeNumber = employeeNumber;
            this.payRate = payRate;
            this.hoursWorked = hoursWorked;
        }
        // overrides tostring 
        public String toString(){
            
            return "["+employeeNumber+"/"+fullName+", "+(int)hoursWorked+" Hours @ "+payRate+" per hour]"; // in homework says 36 instead of 36.0 so type casted to int 
        }
        private double netPay(){

            double netPay = (hoursWorked*payRate)-((hoursWorked * payRate) * 0.06);

            return netPay; // returns int

        }
        public void printCheck(){

            System.out.println("Employees name:\t\t"+fullName);
            System.out.println("Employees number:\t"+employeeNumber);
            System.out.printf("Hourly rate of pay:\t$%.2f\n",payRate); //rounds to 2 decimal places 
            System.out.printf("Hours worked:\t\t%.2f\n\n",hoursWorked); //rounds to 2 decimal places

            System.out.println("Total Gross Pay:\t$"+String.format("%.2f",hoursWorked*payRate)+"\n"); // prints gross pay 

            System.out.println("Deductions");
            System.out.println("Tax(6%)\t\t\t$" + String.format("%.2f",(hoursWorked*payRate)*0.06)+"\n"); // prints taxes

            System.out.println("Net Pay:\t\t$"+String.format("%.2f",netPay())+" Dollars"); // calls private for netPay
        
        }

        
    }
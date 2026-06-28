public class Employee {
    private int employeeIdNo;
    private String employeeName;
    private double employeeSalary;

    Employee(int employeeIdNo,String employeeName, double employeeSalary ){
        this.employeeIdNo = employeeIdNo;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId(){
        return this.employeeIdNo;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public double getEmployeeSalary(){
        return this.employeeSalary;
    }

    public String toString(){
        return this.employeeIdNo + " " + this.employeeName + " " + this.employeeSalary;
    }
}

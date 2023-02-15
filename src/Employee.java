public class Employee {
    private String name;
    private int employeeNumber;
    private int startDate;

    public Employee(String name, int employeeNumber, int startDate) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public int getStartDate() {
        return startDate;
    }

    public boolean isSame(Employee employeeNum){
        return employeeNumber == employeeNum.employeeNumber;
    }

    public boolean isExp(){
        return startDate < 2015;
    }

    public void show(){
        System.out.println("Employee name: " + name + " Employee number: " + employeeNumber + " Start date: " + startDate);
    }

    public int setEmployeeNumber() {
        return employeeNumber = employeeNumber + 1;
    }

}

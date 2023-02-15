public class Company {
    private String name;
    private int numberOfEmployee, index;
    private Employee[] allEmployees;

    public Company(String name, int numberOfEmployee) {
        this.name = name;
        this.numberOfEmployee = numberOfEmployee;
        allEmployees = new Employee[numberOfEmployee];
        index = 0;
    }

    public String getName() {
        return name;
    }

    public boolean addEmployee(Employee employee){
        if(index == allEmployees.length){
            return false;
        }
        for(int i = 0; i < index; i++){
            if(allEmployees[i].isSame(employee)){
                employee.setEmployeeNumber();
            }
        }
        allEmployees[index++] = employee;
        return true;
    }

    public boolean addEmployee(String name, int employeeNumber, int startDate){
        Employee employee = new Employee(name, employeeNumber, startDate);
        if(index == allEmployees.length){
            return false;
        }
        for(int i = 0; i < index; i++){
            if(allEmployees[i].isSame(employee)){
                employee.setEmployeeNumber();
            }
        }
        allEmployees[index++] = employee;
        return true;
    }

    public Employee[] allExpEmployee(){
        int num = 0;
        for(int i = 0; i < index; i++){
            if(allEmployees[i].isExp()){
                num++;
            }
        }
        Employee[] expEmployee = new Employee[num];
        int j = 0;
        for(int i = 0; i < index; i++){
            if(allEmployees[i].isExp()){
                expEmployee[j++] = allEmployees[i];
            }
        }
        return expEmployee;
    }

    public void addToCompany(Company company2){
        for(int i = 0; i < company2.index; i++){
            addEmployee(company2.allEmployees[i]);
        }
    }

    public Company mergeCompany(Company company2){
        Company company3 = new Company("company3", numberOfEmployee + company2.numberOfEmployee);
        for(int i = 0; i < index; i++){
            company3.addEmployee(allEmployees[i]);
        }
        for(int i = 0; i < company2.index; i++){
            company3.addEmployee(company2.allEmployees[i]);
        }
        return company3;
    }

    public int getMergedCompanyNumberOfEmployees(Company company2){
        return numberOfEmployee + company2.numberOfEmployee;
    }

    public void showAllEmployees(){
        for(int i = 0; i < index; i++){
            allEmployees[i].show();
        }
    }

    public void showAllExpEmployees(){
        for(int i = 0; i < index; i++){
            if(allEmployees[i].isExp()){
                allEmployees[i].show();
            }
        }
    }
}
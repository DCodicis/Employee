public class Program {
    public static void main(String[] args) {
        Company company1 = new Company("RedHat", 6);
        company1.addEmployee("yosi", 1, 2010);
        company1.addEmployee("Dana", 2, 2011);
        company1.addEmployee("Slomo", 3, 2019);
        company1.addEmployee("moshe", 4, 2018);
        company1.addEmployee("Avner", 5, 2017);
        company1.addEmployee("Baruh", 6, 2018);

        Company company2 = new Company("F5", 5);
        company2.addEmployee("Daniel", 1, 2006);
        company2.addEmployee("Dana", 2, 2003);
        company2.addEmployee("Hagay", 3, 2012);
        company2.addEmployee("Dani", 4, 2020);
        company2.addEmployee("Moti", 5, 2014);

        System.out.println();
        System.out.println(company1.getName()+"\n");
        company1.showAllEmployees();
        System.out.println("============================================================\n");
        System.out.println(company2.getName()+"\n");
        company2.showAllEmployees();
        System.out.println("============================================================\n");

        int num = company1.getMergedCompanyNumberOfEmployees(company2);

        Company company3 = new Company("F5", num);
        company3.addToCompany(company1);
        company3.addToCompany(company2);
        System.out.println(company3.getName()+"\n");
        company3.showAllEmployees();
        System.out.println("============================================================\n");
        System.out.println("All Exp Employees\n");
        company3.showAllExpEmployees();
    }
}

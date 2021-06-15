package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle = "Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(60.0);
        System.out.println(Math.round(annualDevSalary));
        
        Contructor sdetContractor = new Contructor();
        sdetContractor.jobTitle = "SDET";
       double sdetSalary =  sdetContractor.calculateSalary(55);
        System.out.println("sdetSalary = " + sdetSalary);

        System.out.println(developer.toString());
        System.out.println(sdetContractor.toString());


    }
}

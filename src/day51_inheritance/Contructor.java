package day51_inheritance;

public class Contructor extends Employee {
    @Override
    public String toString() {
        return "Contructor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    @Override // 1- lets everyone know that you are overriding
              // 2- ensures that this method is being overriden. if not, it shows ERROR
    public double calculateSalary(double hourlyRate){
        return  50 * 40 * hourlyRate;

    }
}

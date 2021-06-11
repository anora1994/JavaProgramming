package day47_constructiors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        //constructor with name
        Student st3 = new Student("Burak");
        Student st4 = new Student("Alihan");
        //constructor with age
        Student st5 = new Student(28);

        //constructor with name and age
        Student st6 = new Student("Nasiba", 29);


    }
}

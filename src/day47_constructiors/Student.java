package day47_constructiors;

public class Student {
    //No args constructor
    public Student(){
        System.out.println("No-args constructor");

    }
    public Student(String name){
        System.out.println("name oaram constructor | name = " +name);
    }
    public Student(int age){
        System.out.println("age param constructor | age = " + age);
    }
    public Student (String name, int age){
        System.out.println("name and age param constructor = " + name + "," + age);
    }

}

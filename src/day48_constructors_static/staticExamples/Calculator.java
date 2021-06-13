package day48_constructors_static.staticExamples;

public class Calculator {
    public static void add(int num1, int num2){
        //static method
        System.out.println(num1 + num2);
    }
    //instance or object method
    public void multiply(int num1, int num2){
        System.out.println(num1 * num2);
    }
}

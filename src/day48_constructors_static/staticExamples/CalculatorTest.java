package day48_constructors_static.staticExamples;

public class CalculatorTest {
    public static void main(String[] args) {
        //add is static method can be called using Classname.staticMethodName\
        //static way of calling method
        Calculator.add(2,4);

//multiply is instance method, and we are creating object and calling it
        Calculator calcObject = new Calculator();
        calcObject.multiply(3,9);

        //static method ca also be called using an object
        calcObject.add(12,5);

    }
}

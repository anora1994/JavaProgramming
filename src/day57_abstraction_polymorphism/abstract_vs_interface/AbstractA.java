package day57_abstraction_polymorphism.abstract_vs_interface;

public abstract class AbstractA {
    int num1;
    private double price;
    public static int count;
    public final String type = "abstract";
    public static final String language = "java";

    public AbstractA(){
        System.out.println("AbstractA constructor");
    }

    public abstract void absMethodA();

    public void methodB(){
        System.out.println("methodB called");
    }
    public static void staticMethodC(){
        System.out.println("static methodC is called");
    }
}

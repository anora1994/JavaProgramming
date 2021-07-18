package day57_abstraction_polymorphism.abstract_vs_interface;

public interface InterfaceA {
    public static final String type = "interface";
    double max_count = 500; //this is also public static final

public abstract void absMethodD(int num);

    /**
     * starting from java 8
     * interface can have static and default methods
     */
    public static void staticMethodE(String str){
    System.out.println("staticMethodE is called with str - " + str);
}
public default void defaultMethodF(){
    System.out.println("defaultMethodF is called");
}
}

package day55_abstraction.interface_demo;

public interface MyInterface {
public abstract void learn();
}

interface MyInterface2{

}
class Myclass implements MyInterface, MyInterface2{

    @Override
    public void learn() {
        System.out.println("Learning in  MyClass");
    }
}

class Main{
    public static void main(String[] args) {
       // MyInterface myInterface = new MyInterface(); ERROR: cannot create object of interface
        Myclass myclass = new Myclass();
    }
}
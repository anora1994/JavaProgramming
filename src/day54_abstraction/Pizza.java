package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("Stretch tghe dough and put toppings and cheese and bake it");
    }

    @Override
    public void serve() {
        System.out.println("serve in plate ot in a box");

    }
}

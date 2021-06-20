package day53_inheritance.hiding;

public class Mobile extends Phone{
    String type = "Mobile phone";

    public static void use(){
        System.out.println("Using mobile pphone");
    }

    public void text(){
        use();
        System.out.println("and sending text message");
    }

    @Override
    public void call(){
        use();
        System.out.println("and calling on mobile");
    }
}

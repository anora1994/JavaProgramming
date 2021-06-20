package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla", "Model Y", 48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1);
        System.out.println(ec1.getMake());
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 year = " + ec1.getYear());

        if(ec1.getPrice() > 10000){
            System.out.println(ec1.getMake() + " - " +ec1.getModel() + " is out of my budget");
        }else{
            System.out.println("purchasing " + ec1.toString());
        }
    }
}

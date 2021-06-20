package day53_inheritance.tesla;

public class ModelX extends ElectricCar{
    public ModelX(String make, String model, double price, int year, int range) {
        super(make, model, price, year, range);
    }
    //public void charge(){ ERROR because method is final. cannot be overriden

    }


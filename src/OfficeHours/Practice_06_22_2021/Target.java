package OfficeHours.Practice_06_22_2021;

public class Target extends Shopping{
    @Override
    public void buyItem() {
        System.out.println("Buying item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to target");

    }
}

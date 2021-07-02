package OfficeHours.Practice_06_22_2021;

public class Amazon extends OnlineShopping implements AllowUsersToSell{

    @Override
    public void viewCard() {
        System.out.println("Viewing Amazon Card");

    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item for amazon");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning item from amazon");

    }
    @Override
    public void uploadProduct() {
        System.out.println("Ebay seller");
    }
}

package OfficeHours.Practice_06_22_2021;

public class Ebay extends OnlineShopping implements AllowUsersToSell {
    @Override
    public void viewCard() {
        System.out.println("Viewing ebay card");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from ebay");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning to ebay");

    }

    @Override
    public void uploadProduct() {
        System.out.println("Ebay seller");
    }
}

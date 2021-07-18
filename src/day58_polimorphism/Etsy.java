package day58_polimorphism;

public class Etsy extends OnlineShopping implements HandMade {

    @Override
    public void makeAndSellFromHome(String s) {

    }

    @Override
    public void buy() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void primeShipping() {
        System.out.println("Free 2 day shipping for prime users");
    }
}
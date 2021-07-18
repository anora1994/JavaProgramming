package day58_polimorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new SuperMan();
        spMan1.feedKid();
        spMan1.playWithKid();
        spMan1.raiseKid();

        Worker spMan2 = new SuperMan();
        System.out.println("got paid $ " + spMan2.getPaid());
        spMan2.work("SDET");

        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.work("SM");
        spMan3.feedKid();
        spMan3.raiseKid();
        spMan3.playWithKid();
    }
}

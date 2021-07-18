package day58_polimorphism;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and object superman
        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid();

        //Downcasting from worker to superman
        SuperMan superMan = (SuperMan) worker;
        superMan.feedKid();
        superMan.work("java dev");
    }
}

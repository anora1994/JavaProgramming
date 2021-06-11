package day47_constructiors;

public class myAddress {
    public static void main(String[] args) {
        Address myAddr = new Address();
        myAddr.setAdress("Java 123 St");
        myAddr.setCity("McClean");
        myAddr.setState("VA");
        myAddr.setZipCode("22182");

        System.out.println("myAddr = " + myAddr);

    }
}

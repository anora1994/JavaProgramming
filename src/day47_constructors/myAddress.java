package day47_constructors;

public class myAddress {
    public static void main(String[] args) {
        Address myAddr = new Address();
        myAddr.setAdress("Java 123 St");
        myAddr.setCity("McClean");
        myAddr.setState("VA");
        myAddr.setZipCode("22182");

        System.out.println("myAddr = " + myAddr);
        myAddr.setAdress("8723 jisdoij dl;ks;dls");
        System.out.println("myAddr = " + myAddr);//address will be changed
        
        Address addr2 = new Address();
        addr2.setAdress("18288 9jkdll");
        addr2.setCity("Samarkand");
        System.out.println("addr2 = " + addr2);//null null null null

        Address papaJonPizza= new Address("111 klean st", "Brooklyn", "NY", "11229");
        System.out.println("papaJonPizza = " + papaJonPizza);


    }
}

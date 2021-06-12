package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("John", 4873);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of Customers
        Customer[] todaysCustomer = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        //arrayList of Customer Objects
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir", 449));
        customerList.add(new Customer("Suleyman", 9763));

        //Print info of first customer object in array and arraylist.
        System.out.println(todaysCustomer[0]);
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList);
        System.out.println("----For loop----");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));

        }
        System.out.println("----For each loop----");
        for (Customer each : customerList) {
            System.out.println(each);
        }
        //print only names
        System.out.println("----ONLY NAMES----");
        //for each method and lambda expression
        customerList.forEach(each -> System.out.println(each.getName()));

        for (Customer each : customerList) {
            System.out.println(each.getName());

        }
    }
}


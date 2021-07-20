package day60_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter number: ");
            int num = scan.nextInt();
            System.out.println("You entered " + num);
            System.out.println(num/0);
           // System.exit(0);//stop java all together, finally block will not run1
        }catch(InputMismatchException e){
            System.out.println("You entered Invalid value!");
        }finally {
            scan.close();
            System.out.println("Finally block - runs always");
        }


    }
}

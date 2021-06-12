package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs"); //dependency inhection. Group object creation depends on String name
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Beka");
        group1.addMember("Ali");
        group1.addMember("Dora");
        group1.addMember("Rasim");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCuts");
        group2.setMembers(Arrays.asList("Stephen", "Akrem", "Bulent", "Andrie"));
        //prin all members. not toString()

        System.out.println("group2 members = " + group2.getMembers());

        //use if statement if Akrem in group2
        if(group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is a member of group2");
        }else{
            System.out.println("Akrem isnt here");
        }



    }

}

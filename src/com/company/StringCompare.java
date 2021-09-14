package com.company;
import java.util.*;
public class StringCompare {
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
                System.out.println("Enter 1st String to compare:");
                String string1 =s.nextLine();  
           System.out.println("Enter 2nd String to compare:");
                String string2 =s.nextLine();
            
            System.out.println("Comparing " + string1 + " and " + string2);
            boolean value=string1.equals(string2);
            if(value==true)
                System.out.println("Strings are Equal");
            else
                System.out.println("Strings are Not Equal");
        }
    }




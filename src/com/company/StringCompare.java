package com.company;

public class StringCompare {
        public static void main(String args[])
        {
            String string2 = new String("Practice");
            String string1= new String("Java");
            
            System.out.println("Comparing " + string1 + " and " + string2 + " : ");
            boolean value=string1.equals(string2);
            if(value==true)
                System.out.println("Strings are Equal");
            else
                System.out.println("Strings are Not Equal");
        }
    }




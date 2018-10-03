package com.company;

public class WhileLoop
{
    public static void main(String [] args)
    {
        int counter = 0;
        String myName = "Josemy";
        System.out.println(myName.isEmpty());
        while(counter <= 10)
        {
            System.out.println(counter);
            counter++;
        }//end while

        System.out.println(myName);
    }
}

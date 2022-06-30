package com.company;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Program3
{
    static
    {
        System.out.println("---------------------");
        System.out.println("Factorial of a number");
        System.out.println("_____________________\n");

    }

    static long factorial(long fact)
    {
       while (fact>0)
       {
           return fact*factorial(fact-1);

       }
       return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        long fact=sc.nextLong();
        long result= factorial(fact);
        System.out.println("Factorial of "+fact+" is "+result);
    }
}
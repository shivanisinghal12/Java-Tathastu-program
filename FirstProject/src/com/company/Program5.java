package com.company;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Program5
{
    static
    {
        System.out.println("----------------------------------------");
        System.out.println("Permutation and Combination of 2 numbers");
        System.out.println("________________________________________\n");

    }
    static long permNumFactorial(long fact)
    {
        while (fact>0)
        {
            return fact*permNumFactorial(fact-1);

        }
        return 1;
    }
    static long permDenmFactorial(long fact)
    {
        while (fact>0)
        {
            return fact*permDenmFactorial(fact-1);

        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        long firstNum=sc.nextLong();
        long permNum= permNumFactorial(firstNum);
        System.out.println("Enter second number");
        long secondNum=sc.nextLong();
        long permDenm= permDenmFactorial(firstNum-secondNum);
        long permResult = permNum/permDenm;
        System.out.println("Permutation of "+firstNum+" & "+secondNum+" is "+permResult);
        long combDenm=permNumFactorial(secondNum);
        long combResult=permResult/combDenm;
        System.out.println("Combination of "+firstNum+" & "+secondNum+" is "+combResult);
    }


}
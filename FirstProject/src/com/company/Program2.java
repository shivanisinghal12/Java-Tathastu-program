package com.company;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Program2
{
    static
    {
        System.out.println("--------------------------------");
        System.out.println("Fibonacci series up to n numbers");
        System.out.println("________________________________\n");

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want the series for ex:- 34 ");
        long n=sc.nextLong();
        System.out.println("\n Fibonacci series up to "+n+" is : ");
        long i=1,j=0,k=0;
        System.out.print("0\t");
        ArrayList<Long> al = new ArrayList<>();
        while (k<=n)
        {
            k=i+j;
            if (k<=n)
            {
                al.add(k);
            }
            else
            {
                break;
            }

            i=j;
            j=k;


        }
        for (Long loop:al
             ) {
            System.out.print(loop+"\t");
        }

    }
}

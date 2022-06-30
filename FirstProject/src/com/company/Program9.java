package com.company;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Program9
{
    static
    {
        System.out.println("------------------------------------");
        System.out.println("To remove elements from an ArrayList");
        System.out.println("____________________________________\n");

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter the no.of elements you wish to insert inside the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements below:");
        for (int i=0;i<n;i++)
        {
            al.add(sc.nextInt());
        }
        System.out.println("Elements inside the Array List are :");
        System.out.println(al);
        System.out.println("Element removed is "+al.remove(0));
        System.out.println("After removing the element new updated array is "+al);



    }
}
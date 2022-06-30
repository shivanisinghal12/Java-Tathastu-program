package com.company;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Program7
{
    static
    {
        System.out.println("-------------------------------------------");
        System.out.println("Reversing the letters present in the string");
        System.out.println("___________________________________________\n");

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String rev="";
        for (int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("Original String : "+s);
        System.out.println("Reversed String : "+rev);

    }
}
package com.company;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Program4
{
    static
    {
        System.out.println("----------------------------");
        System.out.println("Palindrome of a given String");
        System.out.println("____________________________\n");

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine().toLowerCase();
        String rev="";
        for (int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if (rev.equals(s))
        {
            System.out.println("Given string is palindrome");
        }
        else
        {
            System.out.println("Given string is not palindrome");
        }

    }
}
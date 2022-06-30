package com.company;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Program6
{
    static
    {
        System.out.println("---------------");
        System.out.println("Diamond Pattern");
        System.out.println("_______________\n");

    }
    public static void main(String[] args)
    {
        for (int i=1;i<=5;i++)
        {
            for (int j=5;j>i;j--)
            {
                System.out.print("\t");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*"+"\t");
            }
            for (int l=2;l<=i;l++)
            {
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        for (int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("\t");
            }
            for (int k=4;k>=i;k--)
            {
                System.out.print("*"+"\t");
            }
            for (int l=4;l>i;l--)
            {
                System.out.print("*"+"\t");
            }
            System.out.println();

        }
    }
}

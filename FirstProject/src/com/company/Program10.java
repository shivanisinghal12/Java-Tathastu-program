package com.company;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Program10
{
    static
    {
        System.out.println("---------------------------------------");
        System.out.println("To find the Transpose of a given Matrix");
        System.out.println("_______________________________________\n");

    }
    public static void main(String[] args)
    {
        int original[][]={{1,3,4},{2,4,3},{3,4,5}};

        System.out.println("Printing Matrix without transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Printing Matrix After Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(original[j][i]+" ");
            }
            System.out.println();//new line
        }
    }
}
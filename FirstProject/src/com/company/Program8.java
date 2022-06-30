package com.company;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Program8
{
    static
    {
        System.out.println("---------------------------------------------------------");
        System.out.println("To check whether the given array is Mirror Inverse or not");
        System.out.println("_________________________________________________________\n");

    }
    static boolean isMirrorInverse(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {


            if (arr[arr[i]] != i)
                return false;
        }

        // Given array is mirror-inverse
        return true;
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 0 };
        if (isMirrorInverse(arr))
            System.out.println("The array is mirror inverse");
        else
            System.out.println("The array is not mirror inverse");
    }
}

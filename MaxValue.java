package org.example;

import java.util.Arrays;

public class MaxValue<T extends Comparable<T>>
{
    public static <T extends Comparable<T>> T maximum(T... number)
    {
        T maxValue = number[0];
        for (int i = 1; i < number.length; i++)
        {
            if (number[i].compareTo(maxValue) > 0)
            {
                maxValue = number[i];
            }
        }
        System.out.println("given values are : ");
        for (int i = 0; i < number.length; i++)
        {
            System.out.print(number[i] + " ");
        }
             System.out.println();
             printMax(maxValue);
             return maxValue;
    }
    public static <T> void printMax(T max)
    {
        System.out.println("Maximum Value is : " + max);
    }
    public static void main(String[] args)
    {
        maximum(3, 58, 36, 55, 13, 6, 79, 38);
        maximum("dee", "zzl", "jsd", "drg", "wdd");
        maximum(11f, 15f, 4.3f, 46.3f, 16.5f);
    }
}

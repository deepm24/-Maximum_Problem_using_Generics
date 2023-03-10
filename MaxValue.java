package org.example;

import java.util.Arrays;
public class MaxValue<T extends Comparable<T>>
{
    T[] maxValue;
    public MaxValue(T[] maxValue)
    {
        this.maxValue = maxValue;
    }
    public static <T extends Comparable<T>> T[] maximum(T... maxValue) {
        System.out.println("Given elements ");
        for (T element : maxValue) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("After Sorting : ");
        Arrays.sort(maxValue);
        for (T element : maxValue) {
            System.out.print(element +"  ");
        }
        System.out.println();
        return maxValue;
    }
    public static void main(String[] args)
    {
        maximum(3, 58, 36,55,13,6,79,38);
        maximum("dee", "zzl", "jsd","drg","wdd");
        maximum(11f, 15f, 4.3f,46.3f,16.5f);
    }
}

package org.example;
public class MaxValue {
    public Integer maximumInteger(Integer x, Integer y, Integer z) {
        Integer maxiValue = x;
        if (y.compareTo(maxiValue) > 0)
            maxiValue = y;
        if (z.compareTo(maxiValue) > 0)
            maxiValue = z;
        return maxiValue;
    }

    public static void main(String[] args)
    {
        // System.out.println(" Maximum Using Generics");
        MaxValue maxValue = new MaxValue();
        System.out.println("Maximum Value of Integer : " + maxValue.maximumInteger(50, 55, 88));

    }
}

package org.example;
public class MaxValue {
    public Float maximumFloat(Float x, Float y, Float z)
    {
        Float  maxiValue = x;
        if (y.compareTo(maxiValue) > 0)
            maxiValue = y;
        if (z.compareTo(maxiValue) > 0)
            maxiValue = z;
        return maxiValue;
    }

    public static void main(String[] args)
    {
        MaxValue maxValue = new MaxValue();
        System.out.println("Maximum Value of Float  : " + maxValue.maximumFloat(50.50F, 1.5f, 8.1f));

    }
}

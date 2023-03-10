package org.example;

public class MaxValue
{
    public  String maximumString(String x, String y, String z)
    {
        String  maxiValue = x;
        if (y.compareTo(maxiValue) > 0)
            maxiValue = y;
        if (z.compareTo(maxiValue) > 0)
            maxiValue = z;
        System.out.println(x+" "+y+" "+z);
        return maxiValue;
    }

    public static void main(String[] args)
    {
        MaxValue maxValue = new MaxValue();
        System.out.println("Maximum Value of String  : " + maxValue.maximumString("Apple","Peach","Banana"));

    }
}

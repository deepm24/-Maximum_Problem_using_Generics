package org.example;

public class MaxValue<T extends Comparable<T>>
{
    T number1;
    T number2;
    T number3;

    public MaxValue(T num1, T num2, T num3)
    {
        this.number1 = num1;
        this.number2 = num2;
        this.number3 = num3;
    }

    public static <T extends Comparable<T>> T maximumGenerict(T number1, T number2, T number3)
    {
        T maximumValue = number1;
        if (number2.compareTo(maximumValue) > 0)
            maximumValue = number2;
        if (number3.compareTo(maximumValue) > 0)
            maximumValue = number3;
        System.out.println(number1+" "+number2+" "+number3);
        return maximumValue;
    }

    public static void main(String[] args)
    {
        Integer intValue = maximumGenerict(55, 550, 88);
        Float floatValue = maximumGenerict(15.3f, 11.9f, 99.2f);
        String stringValue = maximumGenerict("raj", "wns", "Deep");
        System.out.println("Maximum Integer value : " + intValue);
        System.out.println("Maximum Float value : " + floatValue);
        System.out.println("Maximum String value : " + stringValue);
    }
}

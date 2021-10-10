package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinfloatValue = Float.MIN_VALUE;
        float myMaxfloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinfloatValue);
        System.out.println("Float Maximum Value = " + myMaxfloatValue);

        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("Double Max value = " + (myMaxdoubleValue + 1));
        System.out.println("Double Min value = " + (myMindoubleValue - 1));

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue = 5.25;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyIntValue= " + myDoubleValue);
    }
}

package org.jetbrains.scala;



public class TipCalculator {

    public static int calculateTipPercentage(int groupSize) {
        if (groupSize <= 0) {
            return 0;
        } else if (groupSize <= 5) {
            return 10;
        } else {
            return 20;
        }
    }

    public static void main(String[] args) {
        int groupSize1 = 3;
        int groupSize2 = 7;

        System.out.println("Tip percentage for group of " + groupSize1 + ": " + calculateTipPercentage(groupSize1) + "%");
        System.out.println("Tip percentage for group of " + groupSize2 + ": " + calculateTipPercentage(groupSize2) + "%");
    }
}

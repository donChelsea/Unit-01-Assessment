package org.pursuit;

public class Overloader {

    public double doubleDivision(int num1, int num2) {
        double dNum1 = num1;
        double dNum2 = num2;
        return dNum1 / dNum2;
    }

    public double doubleDivision(int num1, double num2) {
        double dNum1 = num1;
        double dNum2 = num2;
        return dNum1 / dNum2;
    }

    public double doubleDivision(double num1, int num2) {
        double dNum1 = num1;
        double dNum2 = num2;
        return dNum1 / dNum2;
    }

    public double doubleDivision(double num1, double num2) {
        double dNum1 = num1;
        double dNum2 = num2;
        return dNum1 / dNum2;
    }

}

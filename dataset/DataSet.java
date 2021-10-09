/*
Author - Charles Chen
Date - 10/7/21
Purpose - Contains methods for the DataSetTester class and this class contains methods that will find the max and min of four numbers
 */

package dataset;

public class DataSet {
    private double min, max;
    public DataSet() {
        min = Double.MIN_VALUE;
        max = Double.MAX_VALUE;
    }

    public void compare(double num1, double num2, double num3, double num4) {
        min = Math.min(num1, Math.min(num2, Math.min(num3, num4)));
        max = Math.max(num1, Math.max(num2, Math.max(num3, num4)));
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }
}

/*
Author - Charles Chen
Date - 10/7/21
Purpose - Asks the user for four numbers and will return the largest and smallest number of the four given by using the
DataSet class and its methods
 */

package dataset;

import java.util.Scanner;

public class DataSetTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will find the max and min of four numbers that you, as the user provides. Please enter a number (1/4):");
        double num1 = scan.nextDouble();
        System.out.println("Please enter another number (2/4): ");
        double num2 = scan.nextDouble();
        System.out.println("Please enter another number (3/4): ");
        double num3 = scan.nextDouble();
        System.out.println("Please enter another number (4/4): ");
        double num4 = scan.nextDouble();

        DataSet data = new DataSet();
        data.compare(num1,  num2, num3, num4);

        System.out.println("The max of the four numbers was: " + data.getMax());
        System.out.println("The min of the four numbers was: " + data.getMin());
    }
}

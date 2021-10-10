package pairs;/*
Author - Charles Chen
Date - 10/7/21
Purpose - Asks the user for two numbers and calls the methods in the pairs.Pair class which can find the sum, difference, product
average, distance, maximum and minimum of the two numbers provided by the user
 */

import pairs.Pair;

import java.util.Scanner;

public class PairTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("This program will do various functions according to the two numbers that you will enter. Please enter a number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        Pair pair = new Pair(num1, num2);
        System.out.println("The sum of the two numbers is: " + pair.getSum());
        System.out.println("The difference of the two numbers is: " + pair.getDiff());
        System.out.println("The product of the two numbers is: " + pair.getProduct());
        System.out.println("The average of the two numbers is: " + pair.getAverage());
        System.out.println("The distance between the two numbers is: " + pair.getDistance());
        System.out.println("The maximum of the two numbers is: " + pair.getMaximum());
        System.out.println("The minimum of the two numbers is: " + pair.getMinimum());
    }
}

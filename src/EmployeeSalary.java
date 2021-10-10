/*
Author - Charles Chen
Date - 10/9/21
Purpose - This class will print out the employee's total weekly pay based on user input of their wage and overtime hours worked
 */

import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will calculate the employee's total weekly pay based on their hourly wage, total hours worked and overtime hours as inputted by the user. Please enter the employee's name:");
        String name = scan.nextLine();
        System.out.println("Please enter their hourly wage: ");
        double wage = scan.nextDouble();
        System.out.println("Please enter their total hours worked: ");
        int hours = scan.nextInt();
        System.out.println("Please enter their overtime hours: ");
        int overtime = scan.nextInt();
        System.out.println(name + "'s weekly pay was: " + wage * (hours-40) + overtime * 1.5 * wage);
    }
}

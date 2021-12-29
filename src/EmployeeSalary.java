/*
Author - Charles Chen
Date - 12/22/21
Purpose - This program prompts the user for hours worked, name of employee, overtime hours worked, and wage and prints out
the total earnings of the employee
 */

import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will calculate the employee's total weekly pay based on their hourly wage, total hours worked and overtime hours as inputted by the user. ");
        // program loop
        do {
            System.out.println("Please enter the employee's name:");
            String name = scan.nextLine();
            double wage;
            // gets valid input for wage
            while (true) {
                try {
                    System.out.println("Please enter their hourly wage: ");
                    wage = Double.parseDouble(scan.nextLine());
                    if (wage < 0) {
                        System.out.println("Hourly wage can't be less than 0.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number");
                }
            }


            double hours = 0;
            // gets valid input for number of hours worked
            while (true) {
                try {
                    System.out.println("Enter the amount of hours worked between 1 to 40 hours.");
                    hours = Double.parseDouble(scan.nextLine());
                    if (hours > 40 || hours < 1) {
                        System.out.println("Please enter a number between 1 and 40.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                }
            }


            double overtimeHours = 0;

            if (hours == 40) {
                // gets valid input for number of overtime hours worked
                while (true) {
                    try {
                        System.out.println("Please enter the number of overtime hours worked.");
                        overtimeHours = Double.parseDouble(scan.nextLine());
                        break;
                    } catch (Exception e) {
                        System.out.println("Please enter a valid number.");
                    }
                }

            }

            double pay = hours * wage + overtimeHours * 1.5 * wage;

            System.out.println(name + " worked " + hours + " hours, and worked " + overtimeHours + " overtime hours, at an hourly wage of "
                    + wage + " to make $" + pay);
            System.out.println("Would you like to continue? Enter no to exit the program and anything else to continue");
        } while (!scan.nextLine().equals("no"));

        System.out.println("The program is terminating.");
    }
}

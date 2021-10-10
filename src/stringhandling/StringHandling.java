/*
Author - Charles Chen
Date - 10/8/21
Purpose - Takes a string from user input and displays the string the user entered, the length, the index of the first string,
the word after the third space, the string from index 12 to the end, the first 8 characters, concatenates parts of the string,
prints various characters from specific indexes, and finds the first occurrence of the string "th" and "is"
 */

package stringhandling;

import java.util.Scanner;

public class StringHandling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will perform various operations based on the string, you, as the user enters. Please enter a sentence: ");
        String string = scan.nextLine();
        System.out.println("The string you entered was: " + string);
        System.out.println("The length of the string was: " + string.length());
        System.out.println("The index location of the first space in the string was: " + string.indexOf(" "));
        System.out.print("The word after the third space in the string was: ");
        String string2 = string.substring(string.indexOf(" ") + 1);
        string2 = string2.substring(string2.indexOf(" ") + 1);
        string2 = string2.substring(string2.indexOf(" ") + 1);
        int indexOfFourthSpace = string2.indexOf(" ");
        System.out.println(string2.substring(0, indexOfFourthSpace));
        System.out.println("The string after index 12 is: " + string.substring(13));
        System.out.println("The first 8 characters of your string is: " + string.substring(0, 8));
        System.out.println("The word after the third space in the string combined with the string after index twelve is:" + string2.substring(0, indexOfFourthSpace) + "//" + string.substring(13));
        System.out.println("The 5th, 9th, 12th indexes from the original string is: " + string.charAt(5) + ", " + string.charAt(9) + ", " + string.charAt(12) + " respectively");

    }
}

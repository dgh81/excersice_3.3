package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int NoSeconds;
        double hours;
        double minutes;
        double seconds;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of seconds:");
        NoSeconds = scanner.nextInt();

        hours = NoSeconds/3600;
        minutes = (NoSeconds % 3600)/60;
        seconds = (NoSeconds % 3600)%60;

        int hours_int;
        hours_int = (int) hours;
        int minutes_int;
        minutes_int = (int) minutes;
        int seconds_int;
        seconds_int = (int) seconds;

	 // Dette kan laves på en enkelt linje, ville se bedre ud mener jeg :). System.out.printf("Number of hours: = %d, Number of minutes: = %d, Number of seconds = %d",hours_int,minutes_int,seconds_int);  
        System.out.printf("Number of hours: = %d \n",hours_int);
        System.out.printf("Number of minutes: = %d \n",minutes_int);
        System.out.printf("Number of seconds: = %d \n",seconds_int);
	    
	    
        /* It should (1) prompt the user for input, (2) read an integer from the keyboard,
        (3) calculate the result, and (4) use printf to display the output.
        For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds". */

    }
}

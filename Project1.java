// Speeder

import java.io.*;
import java.util.*;

public class Project1
{
	public static void main( String args[] )
	{
		Scanner kbd = new Scanner( System.in);

		final int MPH_INCREMENT = 5;	// user pays either $30 or $50
										// for every 5mp overlimit
		final int  LOW_RATE = 30; 	// if not more than 20 over limit then
						  			// driver pays only $30 per every 5mph over limit
		final int HIGH_RATE = 50; 	// if driver over limit by more than 20
							 		// driver pays $50 per every 5mph over limit
		final int HIGHRATE_OVERLIMIT = 20;  // if driver is more than 20 over
									   // driver pays the HIGH_RATE
		final int UNDERAGE_SPEEDER_FINE = 300; // applied to flagrant
		final int MINOR_AGE = 20;  // flagrant speeders under this age are penalized with
								   // the underage speeder fine
		String firstName, lastName;	// driver's name
		int age;				// in whole years
		int speedLimit, driverSpeed, mphOver; // legal, actual, difference
		int rate,fine;      // how much to charge per 5 (or whatever) mph over
		int baseFine=0,zoneFine=0,underAgeFine=0; // 3 components of total fine
		boolean inZone=false;	// did violation occur in a construction zone

		System.out.print("Driver's first name? " );
		firstName = kbd.next();

		System.out.print("Driver's last name? " );
		lastName = kbd.next();

		System.out.print("Driver's speed in mph? ");
		driverSpeed = kbd.nextInt();

		System.out.print("Speed Limit? ");
		speedLimit = kbd.nextInt();

		System.out.print("Driver's age in yrs? ");
		age  = kbd.nextInt();

		System.out.print("Did violation occur in construction zone? ");
		inZone = kbd.nextBoolean();	// must enter exactly "true" or "false" (case IN-sensitive)

		// D O N T  M O D I F Y  A N Y T H I N G   A B O V E

		mphOver=driverSpeed-speedLimit;
		if(mphOver<5)
		 fine=0;
		else if(mphOver<=20)
		{ rate=LOW_RATE;
		  fine=(mphOver/MPH_INCREMENT)*rate;
		 }
		else
		{ rate=HIGH_RATE;
		  fine=(mphOver/MPH_INCREMENT)*rate;
		 }
		if(inZone)
		 zoneFine=fine;
		if(age<21 && mphOver>20)
		 underAgeFine=300;
		baseFine=fine;
		


		// D O N T  M O D I F Y  A N Y T H I N G   B E L O W

		System.out.println( "\n" +
		"Driver Name: : " + lastName + ", " + firstName + "\n" +
		"Driver Age: " + age + "\n" +
		"Speed Limit: " + speedLimit + "\n" +
		"Actual Speed: " + driverSpeed + "\n" +
		"Mph over limit: " + mphOver + "\n" +
		"Base Fine: $" + baseFine + "\n" +
		"Construction Zone Fine: $" + zoneFine + "\n" +
		"Underage Fine: $" + underAgeFine + "\n" +
		"Total Fine: $" + (baseFine+zoneFine+underAgeFine) );

	} // END MAIN METHOD
}

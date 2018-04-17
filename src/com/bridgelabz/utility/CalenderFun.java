package com.bridgelabz.utility;

public class CalenderFun {
	
		/**
	    * Static function to calculate the day.
	    */
	
	public static void dayOfWeek(int day,int mon,int year)
	{
		
		int y=year-(14-mon)/12;
		int x=y+y/4-4/100+y/400;
		int m=mon+12*((14-mon)/12)-2;
		int d=(day+x+31*m)%7;
		day(d);
		
	}
	
		/**
	    * Static function to print the day of week.
	    */
	static void day(int d)
	{
		switch(d)
		{
		case 0: System.out.println("Sunday");
				break;
		case 1: System.out.println("Monday");
				break;
		case 2: System.out.println("Tuesday");
				break;
		case 3: System.out.println("Wednesday");
				break;
		case 4: System.out.println("Thursday");
				break;
		case 5: System.out.println("Friday");
				break;
		case 6: System.out.println("Saturday");
				break;
		}
	}

}

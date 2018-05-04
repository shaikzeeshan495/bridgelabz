/******************************************************************************
 *  Purpose:	Calender using queue.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   02-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;
import com.bridgelabz.utility.Utility;

public class CalenderQueue {
public static void main(String[] args) {
    	
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
	
        String[] months = {
            "",
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        };

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (month == 2 && Utility.isLeap(year)) 
        	days[month] = 29;

        System.out.println("\t\t\t" + months[month] + "\t" + year);
        System.out.println("\tS\tM\tTu\tW\tTh\tF\tS");

        int d = Utility.dayOfWeek( 1,month, year);
        for (int i = 0; i < d; i++)
           QueueLinkedlist.add("\t");

        for (int i = 1; i <= days[month]; i++) 
        {
        	QueueLinkedlist.add("\t"+i);
            if (((i + d) % 7 == 0) || (i == days[month]))
            	QueueLinkedlist.add("\n");
        }	
        QueueLinkedlist.show();

    }	

}

package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class CalenderStack {

	public static void main(String[] args) {
		

        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
       
        StackLinkedlist stack1=new StackLinkedlist();
        StackLinkedlist stack2=new StackLinkedlist();
	
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
           stack1.push("\t");

        for (int i = 1; i <= days[month]; i++) {
        	stack1.push("\t"+i);
            if (((i + d) % 7 == 0) || (i == days[month]))
            	stack1.push("\n");
        }	
      int sizeOfStack=stack1.size();
      while(sizeOfStack>0)
        {
      String data=stack1.pop();
       stack2.push(data);
       sizeOfStack--;
        }	
        
        stack2.display();
	}

}

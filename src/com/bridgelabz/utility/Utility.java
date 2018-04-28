package com.bridgelabz.utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Utility {
	
	private static Scanner scanner = new Scanner(System.in);
	
	/**inputInteger is to take input from scanner
	 * @return scanner to take next input
	 */
	public static int inputInteger(){
		try {
			return scanner.nextInt();
		} 
		catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid input,give integr type input.... again.");
			return inputInteger();
		}
	}
	
	/**inputDouble is to take a double value from input.
	 * @return scanner to take next value.
	 */
	public static double inputDouble(){
		try {
			return scanner.nextDouble();
		} 
		catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid input,give Double type input....try again.");
			return inputDouble();
		}
	}
	
	/**inputBoolean is to take a boolean value from input.
	 * @return scanner to take next value.
	 */
	public static Boolean inputBoolean(){
		try {
			return scanner.nextBoolean();
		} 
		catch (Exception e) {
			scanner.nextLine();
			System.out.println("Invalid input,give Boolean type input....try again.");
			return inputBoolean();
		}
	}
	/**inputString is to take a string value from input.
	 * @return scanner to take next value.
	 */
	public static String inputString(){
		
			return scanner.next();
		
	}
	/**inputString1 is to take a string value from input.
	 * @return scanner to take next value from next Line.
	 */
	public static String inputString1()
	{
		return scanner.nextLine();
	}
	
	//to enter integer elements in array
	/**
	 * @param array is to collect inputs from user.
	 * @return array with inputs.
	 */
	public static int[] inputIntArray(int array[])
	{
	
		for(int i=0;i<array.length;i++)
		{
			array[i]=inputInteger();
		}
		return array;
	}
	
	//to enter string elements in array
		/**
		 * @param array is to collect strings from user.
		 * @return array with input Strings.
		 */
		public static String[] inputStringArray(String array[])
		{
		for(int i=0;i<array.length;i++)
		{
			array[i]=inputString();
		}
		return array;
		}
		
		// Functional 1.username
		/**Static Function replacing to read input String from user and printing them out to standard output.
		 * @param string the String to replace in the Line.
		 * @param name is a string to replace in parent string.
		 * @return String which is replaced.
		 */
		public	static String replacing(String string,String name)
			{
				if(name.length()>=3)
				{
					string=string.replace("<<UserName>>", name);
					return string;
				}
				else
					return "invalid input";
			}
		//Functional 2.Flip coin
		/**
		    * Static function to Flip the coin. 
		    *
		    * @param number the number is for how many times to flip the coin
		    */
		
		public static void flip(int numberOfTimes)
		{
			int heads=0,tails=0;
			if(numberOfTimes>=0)
			{
				for(int flip=1;flip<=numberOfTimes;flip++)
				{
					if(Math.random()<0.5)
						tails++;
					else
						heads++;
				}
			}
			
			else
				System.out.println("enter the positive integer");
			
			System.out.println("Percentage of head "+100.0*heads/numberOfTimes);
			System.out.println("Percentage of tails "+100.0*tails/numberOfTimes);		
		}
		
		//Functional 3.Leap year
		/**
		    * Static function to check a leap year. 
		    *
		    * @param number the number is year to check for a leap year.
		    */	
		public static void isLeap(int year)
			{
				boolean isLeapYear=false;
	    	if(year%4==0)
	    	{
	    		if( year % 100 == 0)
	            {
	                if ( year % 400 == 0)
	                	isLeapYear = true;
	                else
	                	isLeapYear = false;
	            }
	            else
	            	isLeapYear = true;
	        }
	        else {
	        	isLeapYear = false;
	        }

	        if(isLeapYear==true)
	            System.out.println(year + " is a Leap Year.");
	        else
	            System.out.println(year + " is not a Leap Year.");
	    }

		// Functional 4.power of two
	/**
	 * Static function to give value of power 2.
	 *
	 * @param number the number is power to give value of power 2.
	 */
		public static void powerValue(int times){		
		for(int i=0;i<=times;i++)
		{
			int d=(int)Math.pow(2, i);
			System.out.println("2 ^ "+i+" = "+d);
		}
		}
		
		/**
		 * Static function to find annagram from prime numbers
		 *
		 * @param number the array contains prime num to find annagram
		 */
		public static void extendAnnagram(int res[])
		{
			int count=0,j=0;
			String tempString1=" ";
			String tempString2=" ";

			
			for(int i=0;i<res.length;i++)
			{
				
				if(res[i]!=0){
					count++;
				}
			}
			
			int arr[]=new int[count];
			
			for(int i=0;i<res.length;i++)
			{
				
				if(res[i]!=0){
					arr[j++]=res[i];
					System.out.print(res[i]+" ");
				}
			}
			
			System.out.println();
			
			for(int i=0;i<arr.length-1;i++)
			{
				for(int k=i+1;k<arr.length;k++)
				{
					tempString1=""+arr[i];
					tempString2=""+arr[k];
					Utility.annagFunNum(tempString1,tempString2);
				}
				
			}
		}
		
		//Functional 5.Harmonic
		/**
		    * Static function to calculate Harmonic value. 
		    *
		    * @param number the number is to give N value.
		    */
		
		public static void sum(int number)
		{
			float harmonicValue=0;
			if(number!=0)
			{
			for(int i=1;i<=number;i++)
				harmonicValue=((float)1/i)+harmonicValue;
			System.out.println("the harmonic value is: "+harmonicValue);
			}
			else
				System.out.println("please check the entered number");
		}
		
		// Functional 6.Factors
		/**
		    * Static function to computes the prime factorization of N. 
		    *
		    * @param number the number is to give N value.
		    */
		public static void factorization(int number)
		{
			while(number%2==0)
			{
				System.out.print(2+" ");
				number/=2;
			}
			
			for(int i=3;i*i<=number;i++)
			{
				while(number%i==0)
				{
					System.out.print(i+" ");
					number/=i;
				}
			}
			
			if(number>2)
				System.out.print(number);
		}
		
		//Functional 7.Gambler
		/**
		    * Static function to Play till the gambler is broke or has won 
		    *
		    * @param number the number is initial amount.
		    * @param number the number is goal.
		    * @param number the number is number of times to play.
		    */
		public static void game(int stake,int goal,int numberOfTimes)
		{	
			int loss=0;
			int wins=0;
			for(int i=1;i<=numberOfTimes;i++)
			{
				int amount=stake;
				while(amount>0 && amount<goal)
				{
				
					if(Math.random()>0.5)
						amount++;
					else
						amount--;
				}
					if(amount==goal)
						wins++;
					else
						loss++;
			}
			System.out.println("Total number of wins: "+wins);
			System.out.println("Percentage of Win "+100.0*wins/numberOfTimes);
			System.out.println("Percentage of Loss"+100.0*loss/numberOfTimes);	
		}
		
		// Functional 8. coupon number 
		/**
		    * Static function to generate random number and to process distinct coupons. 
		    *
		    * @param number the number is to generate random number.
		    */
		public static void randomnumber(int number)
		{
			int count=0;
			int array[]=new int[number];
			for(int i=0;i<number;i++)
			{
				Random r=new Random();
				int temp=r.nextInt(number);
				count++;
				array[i]=temp+1;
				for(int j=0;j<i;j++)
				{
					if(array[i]==array[j])
					{
						i--;
						break;
					}
				}
			
			}
			
				for(int i=0;i<number;i++)
					System.out.print(array[i]+" ");
			System.out.println();
			System.out.println(count);
		}
		
		
	
	// 9.two d array integers
		//creating a printwriter class
	public static	PrintWriter pwrite = new PrintWriter(System.out,true);
	/**
	 * static function printarray is to print elements in array
	 * @param array to print array
	 * @param row the size of the row
	 * @param column the size of the column
	 */
	public static <T> void printArray(T[][] array,int row,int column)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				pwrite.printf("%s ", array[i][j]);
			}
			System.out.println();
		}
	}
	
	
	/**
	    * Static arrayInteger the array to store integer.
	    */
	public static void arrayInteger()
	{
		System.out.println("Enter a number of rows");
		int m=Utility.inputInteger();
		System.out.println("Enter a number of columns");
		int n=Utility.inputInteger();
		Integer array[][]=new Integer[m][n];
		System.out.println("Enter the inputs");

		for(int i=0;i<=m-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				array[i][j]=Utility.inputInteger();
			}
		}
		
			printArray(array,m,n);
		
	}
	
	/**
	    * Static arrayDouble the array to store double.
	    */
	public static void arrayDouble()
	{
		System.out.println("Enter a number of rows");
		int m=Utility.inputInteger();
		System.out.println("Enter a number of columns");
		int n=Utility.inputInteger();
		Double array[][]=new Double[m][n];
		System.out.println("Enter the inputs");
		
		for(int i=0;i<=m-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				array[i][j]=Utility.inputDouble();
			}
		}
		
		printArray(array,m,n);
	}
		
	/**
	    * Static arrayDouble the array to store Boolean.
	    */
	public static void arrayBoolean()
	{
		System.out.println("Enter a number of rows");
		int m=Utility.inputInteger();
		System.out.println("Enter a number of columns");
		int n=Utility.inputInteger();
		Boolean array[][]=new Boolean[m][n];
		System.out.println("Enter the inputs");
		
		for(int i=0;i<=m-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				array[i][j]=Utility.inputBoolean();
			}
		}
		
		printArray(array,m,n);
	}
	// Functional 10. sum equal to zero.
		/**
	    * Static function to check the number of triples that sum to exactly 0. 
	    *
	    * @param array the array to read input.
	    */
	public	static void triplets(int array[])
		{
			int count=0;
		System.out.println("enter integers in array");
		for(int i=0;i<array.length;i++)
			array[i]=Utility.inputInteger();
		for(int i=0;i<array.length-2;i++)
		{
			for(int j=i+1;j<array.length-1;j++)
			{
				for(int k=j+1;k<array.length;k++)
				{
					if(array[i]+array[j]+array[k]==0)
					{
						count++;
						System.out.println(array[i]+" "+array[j]+" "+array[k]);
					}
				}
			}
		}
		
		System.out.println("Total number of triplets "+count);
	}
	
	// Functional 11.Distance
	/**
	    * Static function to calculate the distance.
	    *
	    * @param numbers the numbers is to calculate the equation.
	    */
	public static void distance(int x,int y)
	{
		double distance=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println(distance);
	}
	
	//Functional 12. Permutations of a String
	/**
	 * static function to permute the String.
	 * @param str is String to permute.
	 * @param left is a low index.
	 * @param rigth is a high index.
	 */
	public static void permute(String str,int left,int rigth)
	{
		 if (left == rigth)
	            System.out.println(str);
	        else
	        {
	            for (int i = left; i <= rigth; i++)
	            {
	                str = swap(str,left,i);
	                permute(str, left+1, rigth);
	            }
	        }
	}
	
	/**static function Swap is to swap characters in a String.
	 * @param str is a String passing to swap a characters in a String.
	 * @param left is a left index.
	 * @param right is a right index.
	 * @return String after swapping.
	 */
	public static String swap(String str,int left,int right)
	{
		 char temp;
	        char[] charArray = str.toCharArray();
	        temp = charArray[left] ;
	        charArray[left] = charArray[right];
	        charArray[right] = temp;
	        return String.valueOf(charArray);
	}
		
	//Functional 13. Stopwatch
		static long START_TIME=0;
		static long STOP_TIME=0;
		static boolean Running=false;
		
			/**
		    * Function to start time
		    */
			public static void start()
			{
				START_TIME=System.currentTimeMillis();
				Running=true;
			}
			
			/**
		    * Function to stop time
		    */
			public static void stop()
			{
				STOP_TIME=System.currentTimeMillis();
				Running=false;
			}
			
			/**
			* Function to calculate time in millisec.
		    */
			public static long getElapsedTime() {
			    long elapsed;
			    if (Running) 
			      elapsed = (System.currentTimeMillis() - START_TIME);
			    else 
			      elapsed = (STOP_TIME - START_TIME);
			    return elapsed;
			}
			
			/**
			* Function to calculate time in sec.
		    */
			public static long getElapsedTimeNanosec() {
			    long elapsed;
			    
			    if (Running) 
			      elapsed = ((System.nanoTime() - START_TIME));
			    else 
			      elapsed = (STOP_TIME - START_TIME);
			    return elapsed;
			}
			
			/**Static function to get a time in seconds.
			 * @return time.
			 */
			public static long getElapsedTimesec() {
			    long elapsed;
			    
			    if (Running) 
			      elapsed = ((System.currentTimeMillis() - START_TIME)/1000);
			    else 
			      elapsed = ((STOP_TIME - START_TIME)/1000);
			    return elapsed;
			}
		
			//Functional 14. TIC TAC TOE GAME
			
			static String[] BOARD;
			static String TURN;
			
			/**static play function is to Start a game.
			 * 
			 */
			public static void play()
			{
				BOARD = new String[9];
				TURN = "X";
				String winner = null;
				populateEmptyBoard();
				printBoard();
				System.out.println("X's will play first. Enter a slot number to place X in:");

				while (winner == null) {
					int slotNumber;
					try {
						slotNumber = Utility.inputInteger();
						if (slotNumber < 0 && slotNumber >= 9) {
							System.out.println("Invalid input; re-enter slot number:");
							continue;
						}
					} catch (InputMismatchException e) {
						System.out.println("Invalid input; re-enter slot number:");
						continue;
					}
					if (BOARD[slotNumber-1].equals(String.valueOf(slotNumber))) {
						BOARD[slotNumber-1] = TURN;
						if (TURN.equals("X")) {
							TURN = "O";
						} else {
							TURN = "X";
						}
						printBoard();
						winner = checkWinner();
					} else {
						System.out.println("Slot already taken; re-enter slot number:");
						continue;
					}
				}
				if (winner.equalsIgnoreCase("draw")) {
					System.out.println("It's a draw! Thanks for playing.");
				} else {
					System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
				}
			}
			/**static checkWinner function is to check status of game.
			 * @return the status of game.
			 */
			static String checkWinner() {
				for (int a = 0; a < 8; a++) 
				{
					String line = null;
					switch (a) {
					case 0:
						line = BOARD[0] + BOARD[1] + BOARD[2];
						break;
					case 1:
						line = BOARD[3] + BOARD[4] + BOARD[5];
						break;
					case 2:
						line = BOARD[6] + BOARD[7] + BOARD[8];
						break;
					case 3:
						line = BOARD[0] + BOARD[3] + BOARD[6];
						break;
					case 4:
						line = BOARD[1] + BOARD[4] + BOARD[7];
						break;
					case 5:
						line = BOARD[2] + BOARD[5] + BOARD[8];
						break;
					case 6:
						line = BOARD[0] + BOARD[4] + BOARD[8];
						break;
					case 7:
						line = BOARD[2] + BOARD[4] + BOARD[6];
						break;
					}
				
					if (line.equals("XXX")) 
						return "X";
					 else if (line.equals("OOO")) 
						return "O";
					
				}

				for (int a = 0; a < 9; a++) 
				{
					if (Arrays.asList(BOARD).contains(String.valueOf(a+1))) 
						break;
					
					else if (a == 8) 
						return "draw";
				}

				System.out.println(TURN + "'s turn; enter a slot number to place " + TURN + " in:");
				return null;
			}
			/**static printBoard funtion is to display the game board.
			 * 
			 */
			static void printBoard() {
				System.out.println("/---|---|---\\");
				System.out.println("| " + BOARD[0] + " | " + BOARD[1] + " | " + BOARD[2] + " |");
				System.out.println("|-----------|");
				System.out.println("| " + BOARD[3] + " | " + BOARD[4] + " | " + BOARD[5] + " |");
				System.out.println("|-----------|");
				System.out.println("| " + BOARD[6] + " | " + BOARD[7] + " | " + BOARD[8] + " |");
				System.out.println("/---|---|---\\");
			}
			/**static populateEmptyBoard function is to fill the board with slot numbers.
			 * 
			 */
			static void populateEmptyBoard() {
				for (int a = 0; a < 9; a++) 
					BOARD[a] = String.valueOf(a+1);
				
				}
			
			// Functional 15.Quadratic
			/**
			    * Static function to find the roots of the equation.
			    *
			    * @param numbers the number is to calculate the equation.
			    * @param numbers the number is to calculate the equation.
			    * @param numbers the number is to calculate the equation.
			    */
			public static void findRoots(int a,int b,int c)
			{
				double delta=0;
				double root2=0;
				double root1=0;
				delta= (b*b)-(4*a*c);
				root1= (-b + Math.sqrt(delta))/(2*a);
				root2= (-b - Math.sqrt(delta))/(2*a);
				System.out.println("Root 1 of x = "+root1);
				System.out.println("Root 2 of x = "+root2);
			}
			
			//Functional 16.Wind chill
				/**
			    * Static function to find the weather.
			    *
			    * @param numbers the numbers is to calculate the temperature.
			    */
				public static void weather(int t,int v)
				{
				
				double w=0;
				if(t<=50 && v<=120 && v>=3)
				{
					w=35.74 + (0.6215*t) + ((0.4275*t)-35.75)*Math.pow(v, 0.16);
					System.out.println(w);
				}
				else
					System.out.println("please enter valid input");		
			}
				
	// Algorithm 1.Annagram string
	
	/**Static function to check annagram.
	 * @param ch1 is a char array to check is it annagram or not.
	 * @param ch2 is a char array to check is it annagram or not.
	 * @return String gives a message wheather is a annagram or not.
	 */
	public static String checkAnnagram(char charArray1[],char charArray2[])
	{
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if(charArray1.length!=charArray2.length)
			return "Not a Annagram";
		else 
		{
			for(int i=0;i<charArray1.length;i++)
			{
				if(charArray1[i]!=charArray2[i])
				{
					return "Not a Annagram";
					
				}
			}	
					return "It is a Annagram";
		}
	
	}			
		/**
	    * Static function to convert strings to char arrays.
	    *
	    * @param string the strings to convert char array.
	    */
	public static void annagramFunction(String s1,String s2)
	{
		String string1=s1.replaceAll("\\s","");
		String string2=s2.replaceAll("\\s","");

		string1=string1.toLowerCase();
		string2=string2.toLowerCase();
		
		char charArray1[]=string1.toCharArray();
		char charArray2[]=string2.toCharArray();
		String str=checkAnnagram(charArray1,charArray2);
		System.out.println(str);
	}
	
	/**
	    * Static function to convert string to array.
	    *
	    * @param string the string to convert string to array.
	    * @param string the string to convert string to array.
	    */
	public static void annagFunNum(String inputString1,String inputString2)
	{	
		char charArray1[]=inputString1.toCharArray();
		char charArray2[]=inputString2.toCharArray();
		checkAnnagNum(charArray1,charArray2);
	}
	/**
	    * Static function to check annagram.
	    *
	    * @param arrays the char arrays to check the annagram.
	    * @param arrays the char arrays to check the annagram.
	    */
	public static void checkAnnagNum(char charArray1[],char charArray2[])
	{
		String temp=new String(charArray2);
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if(charArray1.length!=charArray2.length)
		{
			
		}
		else 
		{
			String string1=new String(charArray1);
			String string2=new String(charArray2);
			if(string1.equals(string2))
				System.out.println(string1+" "+temp+" Annagram");					
		}
	
	}
			
	// Algorithm 2.Prime number
		/**
	    * Static function to generate prime numbers in given range.
	    * @param number the number is for range to generate prime.
	    */
	public static int[] primeNum(int range)
	{
		int array[]=new int[range];
		int j=0;
		for(int i=1;i<=range;i++)
		{
			int count=0;
			for(int num=1;num<=i;num++)
			{
				if(i%num==0)
					count++;
			}
			
			if(count==2)
			{
				array[j++]=i;
			}
		}
		
		return array;
	
	}
	
	// Palindrome
		/**
	    * Static function to check palindrome.
	    * @param number the number is to check palindrome.
	    */
	public static void palindrome(int inputNumber)
	{
		int remainder,sum=0;
		int temp=inputNumber;
		while(inputNumber>0)
		{
			remainder=inputNumber%10;
			sum=(sum*10)+remainder;
			inputNumber=inputNumber/10;
		}
		if(temp==sum)
			System.out.println(sum+" palindrome");
		else
			System.out.println(temp+" not a palindrome");
		
	}
	
	// Algorithm 4. StopWatch to calculate searching and sorting methods.
	/**
	    * Static function to calculate time of binary Strings.
	    * @param array the array is input for binary search strings.
	    * @param string the string is key to search in given words.
	    */
	public static  long binaryStopwatchStr(String array[],String key)
	{	
		long startTime=System.nanoTime();	
		String []sortArray=sortingString(array);
		Utility.binarySearchGeneric(sortArray, 0, 5,key);
		long stopTime=System.nanoTime();
		long timeBinary=stopTime-startTime;
		   
		return timeBinary;
	}
	/**
	    * Static function to calculate time of binary Strings
	    * @param array the array is input for binary search strings
	    * @param string the string is key to search in given words
	    */
	public static  long binaryStopwatchInt(Integer []array,Integer key)
	{
		long startTime=System.nanoTime();
		//Utility.start();
		Arrays.sort(array);
				Utility.binarySearchGeneric(array, 0, 5,key);
		long stopTime=System.nanoTime();
		//Utility.stop();	
		long timeBinary=stopTime-startTime;
		   // System.out.println("Binary search for integer:key found at "+(position+1));
		return timeBinary;
	}
	
		/**
	    * Static function to calculate time of insertion sort
	    * @param array the array of integers is input for insertion sort
	    */
	public static long insertStopwatchInt(Integer[] array) {		
		long startTime=System.nanoTime();
		Utility.insertionSortGeneric(array);
		long stopTime=System.nanoTime();
		long timeInsertInteger=stopTime-startTime;
		return timeInsertInteger;
	}
	
		/**
	    * Static function to calculate time of insertion sort
	    * @param array the array of string is input for insertion sort
	    */
	public static long insertStopwatchStr(String[] array) {
		long startTime=System.nanoTime();
		Utility.insertionSortGeneric(array);
		long stopTime=System.nanoTime();
		long timeInsertString=stopTime-startTime;
		return timeInsertString;
	
	}
		/**
	    * Static function to calculate time of Bubble sort
	    * @param array the array of integer is input for Bubble sort
	    */
public static long bubbleStopwatchInt(Integer array[]) {
		
	long startTime=System.nanoTime();
	 Utility.sortBubbleGeneric(array);
	long stopTime=System.nanoTime();
	long timeBubbleInteger=stopTime-startTime;
	return timeBubbleInteger;
	}

/**
 * Static function to calculate time of Bubble sort.
 * @param array the array of string is input for Bubble sort.
 */
public static long bubbleStopwatchStr(String array[]) {
	
long startTime=System.nanoTime();
Utility.sortBubbleGeneric(array);
long stopTime=System.nanoTime();
long timeBubbleString=stopTime-startTime;
return timeBubbleString;
}

// Algorithm 5. Question and answer
	/**
	    * Static function to guess the number.
	    * @param number the number is to calculate range of guessing.
	    * @param number the number is to calculate range of guessing.
	    */
	public static int guessing(int low,int high)
	{
			int mid=(low+high)/2;	
			if(mid==high)
		    	return mid;
		    System.out.println("If it is "+mid+" then enter 'STOP'");
		    System.out.println("If it is less than" + " " + mid+" then enter 'YES' otherwise 'NO'");
		    String option=Utility.inputString();	    
		    
		    if(option.equalsIgnoreCase("stop"))
		    	return mid;
		    else if(option.equalsIgnoreCase("yes"))
		      return guessing(low,mid);
		    else
		      return guessing(mid+1,high);
	}
	
	// Algorithm 6.Binary Search Generic static function
		/**
		    * Static function to search given word.
		    * @param array the array is to print the sorting number.
		    */
	/*	public  static <T extends Comparable<T>>void searchingKey(T array[],int low,int high,T key)
		{
			if(low<=high)
			{
				int mid=low+(high-low)/2;
			
			if(((String) array[mid]).equalsIgnoreCase((String) key))
				System.out.println("String found at "+(mid+1));
			else if(array[mid].compareTo(key)>0)
				searchingKey(array,low,mid-1,key);
		    else if(array[mid].compareTo(key)<0)
		    	searchingKey(array,mid+1,high,key);
			}else
				 System.out.println("Key not found");
		} */
		
		/** Static function to compare strings and sort to words.
		 * @param str is input String array is to compare string each other.
		 * @return sorting string.
		 */
		public  static String[] sortingWords(String stringArray[])
		{
			for(int i=0;i<stringArray.length-1;i++)
			{
				for(int k=i+1;k<stringArray.length;k++)
				{
					if(stringArray[i].compareTo(stringArray[k])>0)
					{
						String temp=stringArray[i];
						stringArray[i]=stringArray[k];
						stringArray[k]=temp;
					}
						
				}
			}
				return stringArray;
		}
		
		//Binary search for integers for calculating time
		/**static function binaryIntegers is to search a integer and calculate time.
		 * 
		 */
		public static void binaryIntegers()
		{
			System.out.println("enter the length of array");
			int length=inputInteger();
			int array[]=new int[length];
			System.out.println("enter the elements");
			for(int i=0;i<array.length;i++)
				array[i]=inputInteger();
			
			Arrays.sort(array);
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
			
			System.out.println("enter a number to search");
			int key=inputInteger();
			System.out.println("Enter any number to start");
			Utility.start();
			System.out.println();
			int res=binSearchIntegers(array,0,array.length-1,key);
			Utility.stop();
			if(res==-1)
			{
				double Nanosec=Utility.getElapsedTimeNanosec();
				System.out.println(Nanosec+" Nano sec");
				System.out.println("key not found");
			}
			else
			{
				
				double Nanosec=Utility.getElapsedTimeNanosec();
				System.out.println(Nanosec+" Nano sec");
				System.out.println(res+1+" is the position");
			}
			
		}
		
		/**static function binSearchIntegers is to search integers in binary.
		 * @param array is with input numbers.
		 * @param low is initial index of array.
		 * @param high is maximum index of array.
		 * @param key is the number to search.
		 * @return number which is index of key.
		 */
		public static int binSearchIntegers(int[] array,int low,int high,int key)
		{
			int mid=(low+high)/2;
			if(mid==high)
		    	return mid;
			
			if(array[mid]==key)
		    	return mid;
			else if(array[mid]>key)
		      return binSearchIntegers(array,low,mid,key);
		    else if(array[mid]<key)
		      return binSearchIntegers(array,mid+1,high,key);
		        	
			return -1;
			
		}
		
		// Binary search for calculate time Strings.
		/**static function binaryString
		 * 
		 */
	/*	public static void binaryStrings()
		{
			System.out.println("Enter the number of words");
			int count=Utility.inputInteger();
			String array[]=new String[count];
			System.out.println("Enter the words");
			
			for(int i=0;i<array.length;i++)
			{
				array[i]=inputString();
			}
			
			array=sortingWords(array);
			
			System.out.println("after sorting: ");
			for(int i=0;i<array.length;i++)
			{
				System.out.print(array[i]+" ");
			}
			
			System.out.println();
			System.out.println("Enter the word to search");
			String key=inputString();
			
			Utility.searchingKey(array, 0, array.length-1,key);
			
		} */
		
	// Algorithm 7.Insertionsort
		/**
	    * Static function to sort numbers.
	    * @param array the array is to sorting.
	    */
	public static  int[] insertSorting(int array[])
	{
		
		for(int i=0;i<array.length;i++)
		{
			int key=array[i];
			int temp;
			for(int j=i-1;j>=0;j--)
			{
				if(key<array[j])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		return array;
	}
	
		/**
	    * Static function to print order numbers.
	    * @param array the array is to sorting.
	    */
	public static  void printOrder(int[] array)
	{
	for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
	}
	
	// Insertion sort for string.
	    /**
		    * Static function to sort string.
		    * @param array the array is to sorting.
	 * @return String of sorting words.
	 */
	public static String[] sortingString(String array[])
	{
		for(int i=0;i<array.length;i++)
		{
			String key=array[i],temp;
			for(int j=i-1;j>=0;j--)
			{
				if(key.compareTo(array[j])<0)
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
		
	}
	
	/**
	    * Static function to print order of strings.
	    * @param array the array is to print sorting string.
	    */
	static void printOrderString(String array[])
	{
	for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
	}
	
	// Algorithm 8.Bubble Sort for numbers
	/**
	    * Static function to sort numbers.
	    * @param array the array is to sorting.
	    */
	public static int[] sortBubble(int array[])
	{
		int temp=0;
		for(int i=0;i<array.length-2;i++)
		{
			for(int j=0;j<=array.length-2-i;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
	
		/**
	    * Static function to print order numbers.
	    * @param array the array is to print the sorting number.
	    */
	public static void printNum(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	
	// Algorithm 8.Bubble Sort for strings.
		    /**
			    * Static function to sort numbers.
			    * @param array the array is to sorting.
		 * @return string array after Bubble sorting.
		 */
		public static String[] sortingBubbleString(String array[])
		{
			String temp="";
			
			for(int i=0;i<array.length-2;i++)
			{
				for(int j=0;j<=array.length-2-i;j++)
				{
					//if condition true then interchanging values.
					if(array[j].compareTo(array[j+1])>0)
					{
						temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
			return array;
		}
		
			/**
		    * Static function to print order numbers.
		    * @param array the array is to print the sorting number.
		    */
		static void printBubbleString(String array[]){
			for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
		}
	
		//Algorithm 10. Merge Sort
		
		/** static function to sort the numbers.
		 * @param arrayInput is the array with inputs to do partition.
		 * @return array with sorting numbers.
		 */
		public static int[] sortMergeNum(int arrayInput[])
		{
			
			//if given number is only one integer or nothing then it will return.
			if(arrayInput.length<=1)
				return arrayInput;
			
			//dividing length into half.
			int mid=arrayInput.length/2;
			int left[]=new int[mid];
			int right[];
			if(arrayInput.length%2==0)
				right=new int[mid];
			else
				right=new int[mid+1];
			
			//collecting in left array.
			for(int i=0;i<mid;i++)
			{
				left[i]=arrayInput[i];
			}
			//collecting in right array.
			int x=0;
			for(int j=mid;j<arrayInput.length;j++)
			{
				if(x<right.length)
				{
					right[x]=arrayInput[j];
					x++;
				}
			}
			
			left=sortMergeNum(left);
			right=sortMergeNum(right);
			int result[]=mergeArrays(left,right);
			
			return result;
		}
		
		
		/** static function to merge arrays.
		 * @param leftArray to sort and merge with left array.
		 * @param rightArray to sort and merge with right array.
		 * @return array with a sorting numbers.
		 */
		public static int[] mergeArrays(int leftArray[],int[] rightArray)
		{
			//taking length to initialize arrays
			int lengthResult=leftArray.length+rightArray.length;
			int []result=new int[lengthResult];
			int indexLeft=0;
			int indexRight=0;
			int indexResult=0;
			while(indexLeft<leftArray.length||indexRight<rightArray.length)
			{
				if(indexLeft<leftArray.length&&indexRight<rightArray.length)
				{
					if(leftArray[indexLeft]<=rightArray[indexRight])
					{
						result[indexResult]=leftArray[indexLeft];
						indexLeft++;
						indexResult++;
					}
					else
					{
						result[indexResult]=rightArray[indexRight];
						indexRight++;
						indexResult++;
					}
				}
				else if(indexLeft<leftArray.length)
				{
					result[indexResult]=leftArray[indexLeft];
					indexLeft++;
					indexResult++;
				}
				else if(indexRight<rightArray.length)
				{
					result[indexResult]=rightArray[indexRight];
					indexRight++;
					indexResult++;
				}
			}
			return result;
	        
		}
		//to print array
		 /**static function to print array.
		 * @param array to print the array
		 */
		public static void printArray(int array[])
		    {
		        int n = array.length;
		        for (int i=0; i<n; ++i)
		            System.out.print(array[i] + " ");
		        System.out.println();
		    }
		
	//Algorithm 10. Vending Machine
	/** 
	 * static function to count notes
	 *@param integer the number is the given input amount
	 *@return number the total no of notes.
	 */
	public static int countingNotes(int amount)
	{
		int array[]={1000,500,100,50,10,5,2,1};
		int note=0;
		for(int i=0;i<array.length;i++)
		{
			int number=amount/array[i];
			System.out.println(" "+array[i]+" X " +number);
			amount=amount%array[i];
			note=note+number;
		}
		return note;
	}
	
	// Algorithm 11.Calender.
	
	/**Static function to calculate the day.
	 * @param day given input to find the day of week.
	 * @param mon given input to find the day of week.
	 * @param year given input to find the day of week.
	 */
	public static void dayOfWeek(int day,int month,int year)
	{
		
		int yo=year-(14-month)/12;
		int xo=yo+(yo/4)-(yo/100)+(yo/400);
		int mo=month+12*((14-month)/12)-2;
		int d=(day+xo+(31*mo)/12)%7;
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
	
	
	
	// Algorithm 12. Temperature Conversion.
	/**
	    * Static function  fahrenheit as input outputs the temperature in Celsius
	    */
	
	public static void celsius()
	{
				int fahrenheitTemp=Utility.inputInteger();
				int Celsius=(fahrenheitTemp - 32) * 5/9;
				System.out.println(Celsius);
	}
	
	
		/**
	    * Static function  Celsius as input outputs the temperature in fahrenheit
	    */
	public static void fahrenheit()
	{
		int celsiusTemp=Utility.inputInteger();
		int fahrenheit=(celsiusTemp * 9/5) + 32;
		System.out.println(fahrenheit);
	}
	
	// Algorithm 13. Monthly Payment
		/**
		    * Static function to calculate interest compounded monthly.
		    * @param number the number is for calculating the equation.
		    */
		public static void calculation(double principal,double rateOfInterest,double year)
		{
			double n=12*year,r=rateOfInterest/(12*100);
			double payment=(principal*r)/(1-Math.pow((1+r), (-n)));
			System.out.println("monthly payment: "+payment);
		}
	
	//Algorithm 14. Sqrt Newton Method
		/**
	    * Static function  calcSqrt is find square root.
	    * @param double is number to substitute in equation.
	    */
	public static void calculateSqrt(double inputValue)
	{
		 double temp=inputValue, epsilon = 1e-15;
		    
		    while(Math.abs(temp - (inputValue/temp)) > (epsilon * temp))
		        {
		            temp = (((inputValue/temp)+temp)/2.0);
		        }
		       
		    System.out.println("The Square Root of "+inputValue +" is "+temp);
		
	}
	
	// Algorithm 15. Decimal to Binary Conversion.
		
		/**static function toBinary is to convert decinal value to binary.
		 * @param decimal is given input to convrt binary.
		 * @return string which is binary
		 */
		public static String toBinary(int decimal)
		{
			
			String binary="";
			int rem=0;
			while(decimal>0)
			{
				rem=decimal%2;
				binary=rem+binary;
				decimal=decimal/2;
			}
			
			while(binary.length()<8)
			{
				binary=0+binary;
			}
			return binary;
			
		}
		
		/**
		 * static function swapNibbles is to swap nibbles.
		 * @param binary is string of binary to swap nibbles.
		 * @return string after swapping nibbles.
		 */
		
	public static String swapNibbles(String binary)
	{
		 String tempString="";
		 int mid=binary.length()/2;
		 tempString=tempString+binary.substring(mid);
		 tempString=tempString+binary.substring( 0,mid);
		 return tempString;
	}
	/**
	 * static function binToDecimal is to convert binary to decimal.
	 * @param binary is string of binary to swap nibbles.
	 * @return string after converting decimal.
	 */
	
public static String binaryToDecimal(String binary)
{
	int sum=0;
	String tempString="";
	char charArray[]=binary.toCharArray();
	int power=charArray.length-1;
	for(int i=0;i<=charArray.length-1;i++)
	{
		int indexValue=Integer.parseInt(Character.toString(charArray[i]));
		sum=sum+(int)(indexValue*Math.pow(2, power));
		power--;
	}
	tempString=tempString+sum;
	return tempString;
}
	/**
	 * Static function to find annagram from prime numbers.
	 *
	 * @param number the array contains prime num to find Palindrome.
	 */
	public static void extendPalindrome(int primeArray[])
	{
		int count=0,j=0;
		for(int i=0;i<primeArray.length;i++)
		{
			
			if(primeArray[i]!=0){
				count++;
			}
		}
		//creating new array and collecting from old array
		int palindromeArray[]=new int[count];
		for(int i=0;i<primeArray.length;i++)
		{	
			if(primeArray[i]!=0){
				palindromeArray[j++]=primeArray[i];
				System.out.print(primeArray[i]+" ");
			}
		}
		
		System.out.println();
		//Passing array for palindrome.
		for(int i=0;i<palindromeArray.length;i++)
			Utility.palindrome(palindromeArray[i]);
	
	}
	
	/** static fuction insertionSort for generic.
	 * @param array collecting array to sort.
	 * @return array after sorting.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T extends Comparable> T[]  insertionSortGeneric(T[] array)
	{
		for(int i=1;i<array.length;i++)
		{
			T x=array[i];
			int j;
			for(j=i;j>0&&(array[j-1].compareTo(x))>0;j--)
			{
				array[j]=array[j-1];
			}
			array[j]=x;
		}
		return array;
	}
	
	/**static fuction BubbleSort for generic.
	 * @param array input array to sort
	 * @return sorting array
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T extends Comparable> T[] sortBubbleGeneric(T[] array)
	{
		T temp;
		for(int i=0;i<array.length-2;i++)
		{
			for(int j=0;j<=array.length-2-i;j++)
			{
				
				if((array[j]).compareTo(array[j+1])>0)
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
	
	/**static function binary search for generic
	 * @param array collection of words.
	 * @param low initial index.
	 * @param high highest index.
	 * @param key word to be search.
	 */
	public  static <T extends Comparable<T>>void binarySearchGeneric(T array[],Integer low,Integer high,T key)
	{
		if(low<=high)
		{
			int mid=low+(high-low)/2;
		
		if(( array[mid]).compareTo( key)==0)
			System.out.println("String found at "+(mid+1));
		else if(array[mid].compareTo(key)>0)
			binarySearchGeneric(array,low,mid-1,key);
	    else if(array[mid].compareTo(key)<0)
	    	binarySearchGeneric(array,mid+1,high,key);
		}else
			 System.out.println("Key not found");
	}
	
	/**static function printwrite to write a data in a file.
	 * @param file is a location of file where we have to print.
	 * @param data the data which is inserting in a file.
	 * @throws IOException is a class of Exception that was raised due to all Input/Output contingencies .
	 */
	public  static <T extends Comparable<T>> void printwrite(File file,@SuppressWarnings("rawtypes") Comparable data) throws IOException
	{
		FileWriter fw = new FileWriter(file,true);
  	  BufferedWriter bw = new BufferedWriter(fw);
  	  PrintWriter pw = new PrintWriter(bw);
  	  pw.print(data+" ");
  	  pw.close();
  	  
	}

}

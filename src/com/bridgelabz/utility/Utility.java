package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {
	
	private static Scanner scanner = new Scanner(System.in);
	
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
	
	public static String inputString(){
		
			return scanner.next();
		
	}
	
	public static String inputString1()
	{
		return scanner.nextLine();
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
		
		/**
		* Function to calculate time in sec.
	    */
		public static long getElapsedTimesec() {
		    long elapsed;
		    
		    if (Running) 
		      elapsed = ((System.currentTimeMillis() - START_TIME)/1000);
		    else 
		      elapsed = ((STOP_TIME - START_TIME)/1000);
		    return elapsed;
		}
	
	
	
	// 9.two d array integers
	public static	PrintWriter pw = new PrintWriter(System.out,true);
	
	public static <T> void printArray(T[][] array,int row,int column)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				pw.printf("%s ", array[i][j]);
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
	
	// Algorithm 1.Annagram string
	
	/**
	    * Static function to check annagram.
	    *
	    * @param arrays the char arrays to check the annagram.
	    */
	public static String checkAnnagram(char ch1[],char ch2[])
	{
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ch1.length!=ch2.length)
			return "Not a Annagram";
		else 
		{
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
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
	public static void annagramFun(String s1,String s2)
	{
		String str1=s1.replaceAll("\\s","");
		String str2=s2.replaceAll("\\s","");

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		String str=checkAnnagram(ch1,ch2);
		System.out.println(str);
	}
	
	/**
	    * Static function to convert string to array.
	    *
	    * @param string the string to convert string to array.
	    * @param string the string to convert string to array.
	    */
	public static void annagFunNum(String s1,String s2)
	{
		
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		checkAnnagNum(ch1,ch2);
	}
	/**
	    * Static function to check annagram.
	    *
	    * @param arrays the char arrays to check the annagram.
	    * @param arrays the char arrays to check the annagram.
	    */
	public static void checkAnnagNum(char ch1[],char ch2[])
	{
		String temp=new String(ch2);
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ch1.length!=ch2.length)
		{
			
		}
		else 
		{
			String s1=new String(ch1);
			String s2=new String(ch2);
			if(s1.equals(s2))
				System.out.println(s1+" "+temp+" Annagram");
					
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
	
	public static void palindrome(int num)
	{
		int rem,sum=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
			System.out.println(sum+" palindrome");
		else
			System.out.println(temp+" not a palindrome");
		
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
	
	// Algorithm 6.Binary Search for string
		/**
		    * Static function to search given word.
		    * @param array the array is to print the sorting number.
		    */
		public  static int searchingKey(String array[],int low,int high,String key)
		{
			int mid=(low+high)/2;	
			if(mid==high)
		    	return mid;
			if(array[mid].equalsIgnoreCase(key))
		    	return mid;
			else if(array[mid].compareTo(key)>0)
		      return searchingKey(array,low,mid,key);
		    else if(array[mid].compareTo(key)<0)
		      return searchingKey(array,mid+1,high,key);
		        	return -1;
		}
		/**
		    * Static function to compare strings.
		    * @param array the String array is to compare string.
		    */
		public  static String[] sortingWords(String str[])
		{
			for(int i=0;i<str.length-1;i++)
			{
				for(int k=i+1;k<str.length;k++)
				{
					if(str[i].compareTo(str[k])>0)
					{
						String temp=str[i];
						str[i]=str[k];
						str[k]=temp;
					}
						
				}
			}
				return str;
		}
		
		//Binary search for integers for calculating time
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
				long Nanosec=Utility.getElapsedTimeNanosec();
				System.out.println(Nanosec+" Nano sec");
				System.out.println("key not found");
			}
			else
			{
				
				long Nanosec=Utility.getElapsedTimeNanosec();
				System.out.println(Nanosec+" Nano sec");
				System.out.println(res+1+" is the position");
			}
			
		}
		
		public static int binSearchIntegers(int array[],int low,int high,int key)
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
		
		// Binary search for calculate time Strings
		
		public static void binaryStrings()
		{
			System.out.println("Enter the number of words");
			int count=Utility.inputInteger();
			String array[]=new String[count];
			System.out.println("Enter the words");
			
			for(int i=0;i<array.length;i++)
			{
				array[i]=Utility.inputString();
			}
			
			array=Utility.sortingWords(array);
			
			System.out.println("after sorting: ");
			for(int i=0;i<array.length;i++)
			{
				System.out.print(array[i]+" ");
			}
			
			System.out.println();
			System.out.println("Enter the word to search");
			String key=Utility.inputString();
			
			int position=Utility.searchingKey(array, 0, array.length-1,key);
			if(position == -1)
			    System.out.println("Not found");
			  else
			    System.out.println("String found at "+(position+1));
		}
		
	// Algorithm 7.Insertionsort
		/**
	    * Static function to sort numbers.
	    * @param array the array is to sorting.
	    */
	public static void sorting(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.inputInteger();
		}
		
		for(int i=0;i<array.length;i++)
		{
			int key=array[i],temp;
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
		
		printOrder(array);
	}
	
		
		/**
	    * Static function to print order numbers.
	    * @param array the array is to sorting.
	    */
	static void printOrder(int array[])
	{
	for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
	}
	
	
	
	public static void sortingString(String array[])
	{
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.inputString();
		}
		
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
		
		printOrderString(array);
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
	
	// Algorithm 8.Bubble Sort
	/**
	    * Static function to sort numbers.
	    * @param array the array is to sorting.
	    */
	public static void sortBubble(int array[])
	{
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.inputInteger();
		}
		
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
		printNum(array);
	}
	
		/**
	    * Static function to print order numbers.
	    * @param array the array is to print the sorting number.
	    */
	static void printNum(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
	
	// Algorithm 8.Bubble Sort
		/**
		    * Static function to sort numbers.
		    * @param array the array is to sorting.
		    */
		public static void sortingBubbleString(String array[])
		{
			String temp="";
			for(int i=0;i<array.length;i++)
			{
				array[i]=Utility.inputString();
			}
			
			for(int i=0;i<array.length-2;i++)
			{
				for(int j=0;j<=array.length-2-i;j++)
				{
					if(array[j].compareTo(array[j+1])>0)
					{
						temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
			printBubbleString(array);
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
		/* 
		 * static function to sort numbers
		 * param integer the number is the given input aarray
		 */
		public static int[] sortMergeNum(int array[],int low,int high)
		{
			if(low<high)
			{
				int mid=(low+high)/2;
				sortMergeNum(array, low, mid);
				sortMergeNum(array, mid+1, high);
				mergeArrays(array,low,mid,high);
			}
			return array;
		}
		
		/* 
		 * static function to merge arrays
		 * param integer the number is the given input aarray
		 */
		public static void mergeArrays(int array[],int low,int mid,int high)
		{
			int p=mid-low+1;
			int q=high-mid;
			int[] leftArray=new int[p];
			int[] rightArray=new int[q];
		
	        for (int i=0; i<p; ++i)
	            leftArray[i] = array[low + i];
	        for (int j=0; j<q; ++j)
	            rightArray[j] = array[mid + 1+ j];
	        
	        int i = 0, j = 0;
	        int k = low;
	        while (i < p && j < q)
	        {
	            if (leftArray[i] <= rightArray[j])
	            {
	                array[k] = leftArray[i];
	                i++;
	            }
	            else
	            {
	                array[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }
			
	        while (i < p)
	        {
	            array[k] = leftArray[i];
	            i++;
	            k++;
	        }
	 
	        while (j < q)
	        {
	            array[k] = rightArray[j];
	            j++;
	            k++;
	        }
	        
		}
		
		 public static void printArray(int array[])
		    {
		        int n = array.length;
		        for (int i=0; i<n; ++i)
		            System.out.print(array[i] + " ");
		        System.out.println();
		    }
		
	//Algorithm 10. Vending Machine
	/* 
	 * static function to count notes
	 * param integer the number is the given input amount
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
	
	
	
	
	// Algorithm 11.Calender
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
	
	
	
	// Algorithm 12. Temperature Conversion.
	/**
	    * Static function  fahrenheit as input outputs the temperature in Celsius
	    */
	
	public static void celsius()
	{
				int fahrenheitTemp=Utility.inputInteger();
				int temperature=(fahrenheitTemp - 32) * 5/9;
				System.out.println(temperature);
	}
	
	
		/**
	    * Static function  Celsius as input outputs the temperature in fahrenheit
	    */
	public static void fahrenheit()
	{
		int celsiusTemp=Utility.inputInteger();
		int temperature=(celsiusTemp * 9/5) + 32;
		System.out.println(temperature);
	}
	
	// Algorithm 13. Monthly Payment
		/**
		    * Static function to calculate interest compounded monthly.
		    * @param number the number is for calculating the equation.
		    */
		public static void calculation(double principal,double rateOfInterest,double year)
		{
			double n=12*year,r=rateOfInterest/(12*100);
			double payment=(principal*r)/1-Math.pow((1+r), (-n));
			System.out.println(payment);
		}
	
	//Algorithm 14. Sqrt Newton Method
		/**
	    * Static function  calcSqrt is find square root.
	    * param double is number to substitute in equation.
	    */
	public static void calcSqrt(double c)
	{
		 double temp=c, epsilon = 1e-15;
		    
		    while(Math.abs(temp - (c/temp)) > (epsilon * temp))
		        {
		            temp = (((c/temp)+temp)/2.0);
		        }
		       
		    System.out.println("The Square Root of "+c +" is "+temp);
		
	}
	
	// Algorithm 15. Decimal to Binary Conversion.
		/**
		 * static function toBinary is to convert decinal value to binary.
		 * param integer the number to convert binary
		 */
		
		public static String toBinary(int decimal)
		{
		/*	int temp[]=new int[decimal];
			int index=0,j=0;
			while(decimal>0)
			{
					//temp[index]=dec%2;
					//index++;
					//dec=dec/2;
				int value=decimal%2;
				if(value==0)
					temp[j++]=0;
				else
					temp[j++]=1;
				index++;
				decimal=decimal/2;
			}
			int array[]=new int[index+1];
			for(int i=array.length-1;i>=0;i--)
			{
				array[i]=temp[i];
				System.out.print(array[i]);
			}
			System.out.println();
				return array;		*/
			
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
		 * static function swapNibbles is to swap nibbles
		 * @param binary is string of binary to swap nibbles
		 * @return string
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
	 * static function swapNibbles is to swap nibbles
	 * @param binary is string of binary to swap nibbles
	 * @return string
	 */
	
public static String binToDecimal(String binary)
{
	int sum=0;
	String str="";
	char ch[]=binary.toCharArray();
	int power=ch.length-1;
	for(int i=0;i<ch.length-1;i++)
	{
		int indexValue=Integer.parseInt(Character.toString(ch[i]));
		sum=sum+(int)(indexValue*Math.pow(2, power));
		power--;
	}
	str=str+sum;
	return str;
}
/**
 * Static function to give value of power 2.
 *
 * @param number the number is power to give value of power 2.
 */
	public static void powerValue(int times){		
	for(int i=0;i<times;i++)
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
		String s1=" ";
		String s2=" ";

		
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
				s1=""+arr[i];
				s2=""+arr[k];
				Utility.annagFunNum(s1,s2);
			}
			
		}
	}
	
	/**
	 * Static function to find annagram from prime numbers.
	 *
	 * @param number the array contains prime num to find Palindrome.
	 */
	public static void extendPalindrome(int res[])
	{
		int count=0,j=0;
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
		for(int i=0;i<arr.length;i++)
			Utility.palindrome(arr[i]);
	
	}
	
}

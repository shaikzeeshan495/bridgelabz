package com.bridgelabz.utility;

public class PalindromFun {
	public static void palindrome(int num)
	{
		int rem,sum=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			System.out.println(rem);
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		
	}

}

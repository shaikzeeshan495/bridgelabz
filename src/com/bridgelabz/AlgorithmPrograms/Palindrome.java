
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.PalindromFun;
import com.bridgelabz.utility.Utility;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("enter a number");
		int num=Utility.inputInteger();
		PalindromFun.palindrome(num);
	}

}

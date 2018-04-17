
package com.bridgelabz.utility;

import com.bridgelabz.AlgorithmPrograms.ExtendProgram;

public class PrimeFun {
	
		/**
	    * Static function to generate prime numbers in a range of 1 to 1000.
	    */
	public static void primeNum()
	{
		int array[]=new int[168];
		int j=0;
		for(int i=1;i<=1000;i++)
		{
			int count=0;
			for(int num=1;num<=i;num++)
			{
				if(i%num==0)
					count++;		
			}
			if(count==2)
			{
			System.out.println(i);
			array[j++]=i;
			}
		}
		ExtendProgram.toCheckAnnagram(array);
	}

}

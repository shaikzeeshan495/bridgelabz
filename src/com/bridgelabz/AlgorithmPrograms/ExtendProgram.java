package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.AnnagramFun;
import com.bridgelabz.utility.PrimeFun;

public class ExtendProgram {

	public static void toCheckAnnagram(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			String s1=" ";
			String s2=" ";
			for(int j=0;j<array.length;j++)
			{
				s1=s1+array[j];
				s2=s2+array[i];
				char ch1[]=s1.toCharArray();
				char ch2[]=s2.toCharArray();
				String res=AnnagramFun.checkAnnagram(ch1,ch2);
				System.out.println(array[i]+" "+array[j]+" "+res);
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("checking the annagram and palindrom in prime numbers");
		PrimeFun.primeNum();
	}

}

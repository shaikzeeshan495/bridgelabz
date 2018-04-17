package com.bridgelabz.utility;

public class BinaryFunc {
	
	/*
	 * static function toBinary is to convert decinal value to binary.
	 */
	
	public static void toBinary(int dec)
	{
		int array[]=new int[dec];
		int index=0;
		while(dec>0)
		{
				array[index]=dec%2;
				index++;
				dec=dec/2;
		}
		
		for(int i=index-1;i>=0;i--)
			System.out.print(array[i]+" ");
		
	}

}

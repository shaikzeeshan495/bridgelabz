/******************************************************************************
 *  Purpose: A library for reading in 2D arrays.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalPrograms;
import java.io.PrintWriter;
import com.bridgelabz.utility.Utility;

public class TwodArray {
		
	 	/**
	    * Static Function to read inputs from array and printing them out to standard output. 
	    *
	    * @param number the number to intialize the array
	    */	
	static void function(int m,int n,int array[][])
		{
			
			for(int i=0;i<=m-1;i++)
			{
				for(int j=0;j<=n-1;j++)
				{
					array[i][j]=Utility.inputInteger();
				}
			}
			
			PrintWriter pw = new PrintWriter(System.out);
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					pw.print(array[i][j]+" ");
				}
				pw.println();
			}
			pw.flush();
		}
		
		/*
	    * The main function is create 2 dimensional array in memory to read in M rows and N cols
	    */
		public static void main(String[] args) {
			int m=Utility.inputInteger();
			int n=Utility.inputInteger();
			int array[][]=new int[m][n];
			function(m,n,array);
		}

}

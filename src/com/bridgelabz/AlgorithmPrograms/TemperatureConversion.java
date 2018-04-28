/******************************************************************************
 *  Purpose:	Temperature Conversion
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;


import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		
		System.out.println("To enter the temperature in fahrenheit enter 1");
		System.out.println("To enter the temperature in Celsius enter 2");
		int input=Utility.inputInteger();
		switch(input)
		{
		case 1:	System.out.println("enter a temperature");
				Utility.celsius();
				break;
		case 2:	System.out.println("enter a temperature");
				Utility.fahrenheit();
				break;
		default: System.out.println("enter valid input");
				break;
		
		}
		
	}

}

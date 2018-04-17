package com.bridgelabz.utility;

public class TemperatureFunc {
	
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

}

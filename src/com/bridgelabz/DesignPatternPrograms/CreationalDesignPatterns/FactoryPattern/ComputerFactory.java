/******************************************************************************
 *  Purpose:	FactoryPattern
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   12-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DesignPatternPrograms.CreationalDesignPatterns.FactoryPattern;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		//creating a object of particular subclass and return
		if("PC".equalsIgnoreCase(type))
			return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram, hdd, cpu);
		
		return null;
	}

}

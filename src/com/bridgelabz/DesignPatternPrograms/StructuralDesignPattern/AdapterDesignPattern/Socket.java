/******************************************************************************
 *  Purpose:	Socket class to return volts
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   11-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DesignPatternPrograms.StructuralDesignPattern.AdapterDesignPattern;

public class Socket {

	public Volt getVolt(){
		return new Volt(120);
	}
}

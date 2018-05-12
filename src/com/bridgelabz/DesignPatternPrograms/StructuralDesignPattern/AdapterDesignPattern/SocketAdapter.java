/******************************************************************************
 *  Purpose:	SocketAdapter
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   11-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DesignPatternPrograms.StructuralDesignPattern.AdapterDesignPattern;

public interface SocketAdapter {

	public Volt get120Volt();
		
	public Volt get12Volt();
	
	public Volt get3Volt();
}

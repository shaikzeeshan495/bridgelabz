/******************************************************************************
 *  Purpose:	RealInternet
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   11-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DesignPatternPrograms.StructuralDesignPattern.ProxyDesignPattern;


	public class RealInternet implements Internet
	{
	    @Override
	    public void connectTo(String serverhost)
	    {
	        System.out.println("Connecting to "+ serverhost);
	    }
	}



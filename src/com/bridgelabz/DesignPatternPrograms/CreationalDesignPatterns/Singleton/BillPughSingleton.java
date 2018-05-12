/******************************************************************************
 *  Purpose:	BillPughSingleton
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   09-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DesignPatternPrograms.CreationalDesignPatterns.Singleton;

public class BillPughSingleton {
	
	//private constructor
	private BillPughSingleton()
	{
		
	}

	//creating variable in a inner class
private static class InnerClass
{
	private static BillPughSingleton INSTANCE=new BillPughSingleton();
}

//global acess method
public static BillPughSingleton getInstance()
{
	return InnerClass.INSTANCE;
}
	

public static void main(String[] args) {
		//Creating object  Instance1
		BillPughSingleton instance1 = BillPughSingleton.getInstance();

			     //Creating object  Instance2
		BillPughSingleton instance2 = BillPughSingleton.getInstance();

			     //now lets check the hash key.
			     System.out.println("Instance 1 hash:" + instance1.hashCode());
			     System.out.println("Instance 2 hash:" + instance2.hashCode());

	}

}

/******************************************************************************
 *  Purpose:	LazyInitializedSingleton
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   09-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DesignPatternPrograms.CreationalDesignPatterns.Singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton INSTANCE;
	private LazyInitializedSingleton()
	{
		
	}
	public static LazyInitializedSingleton getInstance(){
		if(INSTANCE==null)
		{
			INSTANCE=new LazyInitializedSingleton();
		}
		return INSTANCE;
	}
	public static void main(String args[])
	 {
		 //Creating object  Instance1
		LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();

	     //Creating object  Instance2
		LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();

	     //now lets check the hash key.
	     System.out.println("Instance 1 hash:" + instance1.hashCode());
	     System.out.println("Instance 2 hash:" + instance2.hashCode());  

	 }

}

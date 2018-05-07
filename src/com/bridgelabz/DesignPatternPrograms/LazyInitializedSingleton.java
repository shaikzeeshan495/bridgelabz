package com.bridgelabz.DesignPatternPrograms;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	private LazyInitializedSingleton()
	{
		
	}
	public static LazyInitializedSingleton getInstance(){
		if(instance==null)
		{
			instance=new LazyInitializedSingleton();
		}
		return instance;
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

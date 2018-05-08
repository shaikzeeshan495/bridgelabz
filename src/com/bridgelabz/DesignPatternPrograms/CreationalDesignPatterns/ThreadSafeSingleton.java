package com.bridgelabz.DesignPatternPrograms;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton INSTANCE;
	private ThreadSafeSingleton(){	
	}
	public static synchronized ThreadSafeSingleton getInstance()
	{
		if(INSTANCE==null)
			INSTANCE=new ThreadSafeSingleton();
		return INSTANCE;
	}
	
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
	    if(INSTANCE == null){
	        synchronized (ThreadSafeSingleton.class) {
	            if(INSTANCE == null){
	            	INSTANCE = new ThreadSafeSingleton();
	            }
	        }
	    }
	    return INSTANCE;
	}
	public static void main(String args[])
	 {
		 //Creating object  Instance1
		ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();

	     //Creating object  Instance2
		ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();

	     //now lets check the hash key.
	     System.out.println("Instance 1 hash:" + instance1.hashCode());
	     System.out.println("Instance 2 hash:" + instance2.hashCode());  

	 }

}

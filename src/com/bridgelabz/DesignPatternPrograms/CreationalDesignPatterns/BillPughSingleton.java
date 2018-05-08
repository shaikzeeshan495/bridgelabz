package com.bridgelabz.DesignPatternPrograms;

public class BillPughSingleton {
	private BillPughSingleton()
	{
		
	}
private static class InnerClass
{
	private static BillPughSingleton INSTANCE=new BillPughSingleton();
}

public static BillPughSingleton getInstance()
{
	return InnerClass.INSTANCE;
}
	public static void main(String[] args) {
		//Creating object  Instance1
				ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();

			     //Creating object  Instance2
				ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();

			     //now lets check the hash key.
			     System.out.println("Instance 1 hash:" + instance1.hashCode());
			     System.out.println("Instance 2 hash:" + instance2.hashCode());

	}

}

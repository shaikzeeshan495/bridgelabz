package com.bridgelabz.DesignPatternPrograms.CreationalDesignPatterns.Singleton;

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
		BillPughSingleton instance1 = BillPughSingleton.getInstance();

			     //Creating object  Instance2
		BillPughSingleton instance2 = BillPughSingleton.getInstance();

			     //now lets check the hash key.
			     System.out.println("Instance 1 hash:" + instance1.hashCode());
			     System.out.println("Instance 2 hash:" + instance2.hashCode());

	}

}

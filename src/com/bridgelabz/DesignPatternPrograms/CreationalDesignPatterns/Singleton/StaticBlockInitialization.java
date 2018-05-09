package com.bridgelabz.DesignPatternPrograms.CreationalDesignPatterns.Singleton;

public class StaticBlockInitialization {
	private final static StaticBlockInitialization INSTANCE;
	
	 private StaticBlockInitialization(){
	 }
	 static{
	        try{
	        	INSTANCE =new StaticBlockInitialization();
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	 }
	 public static StaticBlockInitialization getInstance()
	 { 
		 return INSTANCE;
	 }
	 public static void main(String args[])
	 {
		 //Creating object  Instance1
		 StaticBlockInitialization instance1 = StaticBlockInitialization.getInstance();

	     //Creating object  Instance2
		 StaticBlockInitialization instance2 = StaticBlockInitialization.getInstance();

	     //now lets check the hash key.
	     System.out.println("Instance 1 hash:" + instance1.hashCode());
	     System.out.println("Instance 2 hash:" + instance2.hashCode());  

	 }

}

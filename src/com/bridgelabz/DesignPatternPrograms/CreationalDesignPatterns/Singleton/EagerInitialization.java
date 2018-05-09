package com.bridgelabz.DesignPatternPrograms.CreationalDesignPatterns.Singleton;

public class EagerInitialization {
 private final	static EagerInitialization INSTANCE=new EagerInitialization();
 
 private EagerInitialization(){
 }
 public static EagerInitialization getInstance()
 { 
	 return INSTANCE;
 }
 public static void main(String args[])
 {
	 //Creating object  Instance1
	 EagerInitialization instance1 = EagerInitialization.getInstance();

     //Creating object  Instance2
	 EagerInitialization instance2 = EagerInitialization.getInstance();

     //now lets check the hash key.
     System.out.println("Instance 1 hash:" + instance1.hashCode());
     System.out.println("Instance 2 hash:" + instance2.hashCode());  

 }
}

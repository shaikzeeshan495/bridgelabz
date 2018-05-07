package com.bridgelabz.DataStructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import com.bridgelabz.utility.Utility;

public class HashFunction2 {
	public static OrderedLinkedList orderList[]=new OrderedLinkedList[11];
	
	public <T extends Comparable<T>> void objects()
	{
		for(int i=0;i<11;i++)
		{
			orderList[i]=new OrderedLinkedList();
		}
	}
	
	public  <T extends Comparable<T>> void operationAdd(T data)
	{
		
		int index=(Integer)data%11;
	//	System.out.println("index: "+index+" Data: "+data);
		orderList[index].add(data);
		
	}
	
	public  <T extends Comparable<T>> void display()
	{
		for(int i=0;i<11;i++)
		{
			System.out.print(i+": ");
			orderList[i].show();
		}
	}
	
	public  <T extends Comparable<T>> boolean search(T data)
	{
		boolean flag;
		for(int i=0;i<11;i++)
		{
			flag=orderList[i].search(data);
			
			if(flag==true)
				{
				orderList[i].delete(data);
				return true;
				}
				
		}
		return false;
	}
	public void write()
	{
	//	Utility.writeLinkedList("/home/bridgeit/zeeshan/Files/Hashing.txt",orderList[i]);
		
	}
	
/*	public  <T extends Comparable<T>> void operateMap()
	{
		HashMap<Integer, LinkedList> hmap = new HashMap<Integer, LinkedList>();
		for(int i=0;i<11;i++)
		{
		
			hmap.put(i,orderList[i]);
		}
		
		for (Map.Entry me : hmap.entrySet()) {
	          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
	        }
	}	*/
}

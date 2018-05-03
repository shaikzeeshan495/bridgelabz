package com.bridgelabz.DataStructures;

public class HashFunction {
	public static OrderedLinkedList orderList[]=new OrderedLinkedList[11];
	
	public <T extends Comparable<T>> void objects()
	{
		for(int i=0;i<11;i++)
		{
			orderList[i]=new OrderedLinkedList();
		}
	}
	
	public  <T extends Comparable<T>> void operation(T data)
	{
		
		int index=(Integer)data%11;
		System.out.println("index: "+index+" Data: "+data);
		orderList[index].add(data);
		
	}
	
	public  <T extends Comparable<T>> void display()
	{
		for(int i=0;i<11;i++)
		{
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

}

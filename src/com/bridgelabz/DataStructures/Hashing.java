package com.bridgelabz.DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Hashing {
	public void hashingfun() throws FileNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		File file=new File("/home/bridgeit/zeeshan/Files/Hashing.txt");
		sc=new Scanner(file);
		LinkedList<Integer> list=new LinkedList<>();
		while(sc.hasNext())
		{
			Integer num=sc.nextInt();
			list.add(num);
		}
//		System.out.println("size is "+list.size());
		HashMap<Integer,LinkedList> hashmap=new HashMap<>();
		int rem=0;
		int data=0;
		for(int i=0;i<list.size();i++)
		{
			data=list.get(i);
			rem=data%11;
			if(hashmap.containsKey(rem))
			{
				hashmap.get(rem).add(data);
			}
		}
//		System.out.println("size is 2: "+list.size());
		Iterator<?> iterator=(Iterator<?>)hashmap.keySet().iterator();
		while(iterator.hasNext())
		{
			int key=(int)iterator.next();
			System.out.println(key);
			System.out.println(hashmap.get(key));
		}
//		System.out.println("size is 3: "+list.size());
		System.out.println("enter target to search");
		Integer target1=Utility.inputInteger();
		if(list.contains(target1))
		{
			System.out.println("element is found and delete");
			hashmap.get(rem).remove(target1);
			
		}
		else
		{
			System.out.println("element is not found and adding");
			System.out.println(list.add(target1));
			rem=target1%11;
			if(hashmap.containsKey(rem))
				hashmap.get(rem).add(target1);
			else
			{
				hashmap.put(rem,new LinkedList());
				hashmap.get(rem).add(target1);
			}
		}
		Iterator<?> iterator1=hashmap.keySet().iterator();
		while(iterator1.hasNext())
		{
			int key=(int)iterator1.next();
			System.out.println(key);
			System.out.println(hashmap.get(key));
		}
		
	}

}

package com.bridgelabz.ObjectOriented.CommercialDataProcessing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.bridgelabz.utility.Utility;

public class LinkedlistStock {
	public NodeStock	 [] table;
	public int size;
	 NodeStock HEAD;	
		/**static add function to add a data inside a list
		 * @param companies the data wants to add in a list
		 */
		public <T extends Comparable<T>> void add(Companies companies)
		{
		NodeStock node=new NodeStock();
		node.data=(Comparable) companies;
		node.nextNode=null;
		if(HEAD==null)
			HEAD=node;
		else
		{
			NodeStock temp=HEAD;
			while(temp.nextNode!=null)
			{
				temp=temp.nextNode;
			}
			temp.nextNode=node;
		}
	}
		
		public  <T extends Comparable<T>> Companies searchCompany(T word) throws Exception
		{
			int count=0;
			Companies company=new Companies();
			NodeStock temp=HEAD;
				while(temp!=null)
				{
					company=(Companies) temp.data;
					if(company.equals(word))
					{
						count++;
						System.out.println("Company was Availabile");
						return company;
					}
					temp=temp.nextNode;
				}
				
				if(count==0)
				{
					System.out.println("Company was not available ");
					System.out.println("enter 1 for company");
					System.out.println("enter 2 for main menu");
					int choice=Utility.inputInteger();
					switch(choice)
					{
					case 1:	System.out.println("Enter Company details");
					word=(T) Utility.inputString();
							searchCompany(word);
							break;
					case 2:Utility.stockAccount();
							break;
					default:System.out.println("invalid input");
						System.exit(0);
					}
				}
			
			return company;
		}
		
		/**static function show to display the list.
		 * 
		 */
		public <T extends Comparable<T>> void show()
			{
			NodeStock node=HEAD;
				if(HEAD==null)
				{
					System.out.print("empty");
				}
				else if(HEAD.nextNode==null)
				{
					System.out.print(node.data+" ");
				}
				else
				{	while(node!=null)
					{
						System.out.print(node.data+" ");
						node=node.nextNode;
					}
				}System.out.println();
			}
		
	
		/**print function is to override data in file.
		 * @throws IOException is a class of Exception that was raised due to all Input/Output contingencies.
		 */
		public void print() throws IOException
		{
			File file=new File("/home/bridgeit/zeeshan/Files/OrderedList.txt");
			FileWriter fw = new FileWriter(file);
		  	  BufferedWriter bw = new BufferedWriter(fw);
		  	  PrintWriter pw = new PrintWriter(bw);
		  	NodeStock node=HEAD;
			if(HEAD==null)
			{
				System.out.println("empty");
			}
			else if(HEAD.nextNode==null)
			{
				pw.print(node.data+" ");
			}
			else
			{	while(node!=null)
				{
				pw.print(node.data+" ");
					node=node.nextNode;
				}
			}
		  	  pw.close();
			
		}

}

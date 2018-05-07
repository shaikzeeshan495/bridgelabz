/******************************************************************************
 *  Purpose:	Hash map
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   4-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class Hashchaining {
	public Node	 [] table;
	public int size;
	 Node head;
	
	/**Hashchaining is a function to initialize a table size.
	 * @param tableSize is a given input size
	 */
	public Hashchaining(int tableSize) {
		table = new Node[tableSize];
		size=0;
	}

	/**isEmpty to check the status of list.
	 * @return
	 */
	public boolean isEmpty() {
		return size==0;
	}
	
	/**insert is a function to insert a data in particular list.
	 * @param value given input data.
	 */
	public void insert(int value) {
		size++;
		int position=tablePosition(value);
		Node node = new Node();
		node.data=value;
		node.nextNode=null;
		if(table[position]==null)
			table[position]=node;
		else {
			node.nextNode=table[position];
			table[position]=node;
		}
	}

	/**remove is a function to remove a data in particular list.
	 * @param value given input data.
	 */
	public void remove(int data) {
		int position = tablePosition(data);
		Node temp = table[position];
		Node previous = null;
		Integer nodeData = (Integer) temp.data;
		if(nodeData.equals(data)) {
			previous = temp;
			temp = temp.nextNode;
			table[position]=temp;
			previous=null;
			return;
		}
		else{
		while(temp!=null) {
			nodeData = (Integer) temp.data;
			if(nodeData.equals(data))
				break;
			else
			{
				previous = temp;
				temp=temp.nextNode;
			}
		}
		previous.nextNode = temp.nextNode;
		}
	}
	
	/**tablePosition to find out table position.
	 * @param value is input integer data.
	 * @return hashvale is integer data i.e..particular position of list.
	 */
	public int tablePosition(int value) {
		int hashVal=value;
		hashVal = hashVal % table.length;
		return hashVal;
	}
	
	/**display is a function to display data in list.
	 * 
	 */
	public void display() {
		for(int i=0;i<table.length;i++) {
			System.out.print(i+" : ");
			Node t = table[i];
			while(t!=null) {
				System.out.print(t.data+" ");
				t=t.nextNode;
			}
			System.out.println();
		}
	}

	/**search function is to search data in hash map.
	 * @param value is given input integer data.
	 */
	public void search(int value) {
		int position = tablePosition(value);
		Integer data = value;
		int count=0;
		Node temp = table[position];
		while(temp!=null) {
			if(temp.data.equals(data)) {
				count++;
				break;
			}
			temp=temp.nextNode;
		}
		if(count>0) {
			System.out.println("Data found at table position "+position+"\nData removed");
			remove(value);
		}
		else {
			System.out.println("Data not found\nData added");
			insert(value);
		}
	}
	
	/**write is a function to write data in a file.
	 * @throws Exception
	 */
	public void write() throws Exception
	{
		Utility.writeHash("HashingFile",table);
	}

}

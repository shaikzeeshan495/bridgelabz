package com.bridgelabz.ObjectOriented.CommercialDataProcessing;

public class QueueStock <T>{
	 NodeStock HEAD;
	 int SIZE=0;
	/**static add function to add a data at end of list.
	 * @param data the data wants to add in a list.
	 */
	public  <T extends Comparable<T>> void add(T data)
	{
		NodeStock node=new NodeStock();
		node.data=data;
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
	/**static remove funtion is to remove the data in front of list.
	 * @param position the data which has to be remove.
	 */
	@SuppressWarnings("unchecked")
	public  <T extends Comparable<T>> void remove()
	{
		if(HEAD==null)
			System.out.println("Empty");
		else
		{
			NodeStock temp=HEAD;
			HEAD=HEAD.nextNode;
			temp=null;
		}
			
	}
	/**static function show to display the list.
	 * 
	 */
	public  <T extends Comparable<T>> void show()
		{
		NodeStock node=HEAD;
			while(node.nextNode!=null)
			{
				System.out.println(node.data+" ");
				node=node.nextNode;
			}
			System.out.println(node.data+" ");
		}

}

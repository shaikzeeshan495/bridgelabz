package com.bridgelabz.ObjectOriented.CommercialDataProcessing;


public class StackStock {
	 NodeStock HEAD;
		public static int SIZE=0;
		
		/**static add function to add a data at front of list.
		 * @param data the data wants to add in a list.
		 */
		public  <T extends Comparable<T>> void push(Object data)
		{
			NodeStock node=new NodeStock();
			node.data=data;
			node.nextNode=null;
			if(HEAD==null)
			{
				HEAD=node;
				SIZE++;
			}
			else
			{
				NodeStock temp=node;
				temp.nextNode=HEAD;
				HEAD=temp;
				SIZE++;
			}
		}

		/**static remove funtion is to remove the data in front of list.
		 * @param position the data which has to be remove.
		 */
		@SuppressWarnings("unchecked")
		public  <T extends Comparable<T>> void pop()
		{
			NodeStock temp=HEAD;
			NodeStock result2=null;
			if(HEAD==null)
				System.out.println("Empty");
			else
			{
				HEAD=temp.nextNode;
				System.out.println(temp.data.toString());
				temp=null;
				SIZE--;
			}

			
		}
		
	/**static search funtion is to search the given word.
	 * @param word the word which has to be search.
	 * @return integer which is position of the word.
	 */
	public  <T extends Comparable<T>> int search(T word)
	{
		NodeStock temp=HEAD;
			int i=0;
			while(temp!=null)
			{
				if(temp.data.equals(word))
				{
					return i;
				}
				temp=temp.nextNode;
					i++;
			}
		
		return -1;
	}



	/**static function show to display the list.
	 * 
	 */
	public <T extends Comparable<T>> void display()
		{
		NodeStock node=HEAD;
			while(node.nextNode!=null)
			{
				System.out.println(node.data+"\n");
				node=node.nextNode;
			}
			System.out.println(node.data);
		}
		/**isEmpty function is to give a status of stack.
		 * @return string status of stack either stack is empty or full.
		 */
		public  <T extends Comparable<T>> boolean isEmpty()
		{
			if(HEAD==null)
				return true;
			else
				return false;
		}
		
		/**isEmpty function is to give a status of stack.
		 * @return string status of stack either stack is empty or full.
		 */
		public  int size()
		{
			return SIZE;
		}
}

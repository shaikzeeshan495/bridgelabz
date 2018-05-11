/******************************************************************************
 *  Purpose:	Extending Deck Of Cards for sorting.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   11-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.ObjectOriented;

import com.bridgelabz.DataStructures.QueueLinkedlist;
import com.bridgelabz.utility.Utility;

public class ExtendDeckCards {

	public static void main(String[] args) {
		ExtendDeckCards deck=new ExtendDeckCards();
		String [][]array=Utility.deckOfCards();
		QueueLinkedlist person1=new QueueLinkedlist();	
		QueueLinkedlist person2=new QueueLinkedlist();
		QueueLinkedlist person3=new QueueLinkedlist();
		QueueLinkedlist person4=new QueueLinkedlist();
		
		String []newArray1=deck.sortingString(array,0);
		for(int i=0;i<9;i++)
		{
			person1.add(newArray1[i]);
		}
			
		String []newArray2=deck.sortingString(array,1);		
		for(int i=0;i<9;i++)
		{
			person2.add(newArray2[i]);
		}
		
		String []newArray3=deck.sortingString(array,2);		
		for(int i=0;i<9;i++)
		{
			person3.add(newArray3[i]);
		}
		
		String []newArray4=deck.sortingString(array,3);		
		for(int i=0;i<9;i++)
		{
			person4.add(newArray3[i]);
		}
		person1.show();
		System.out.println();
		person2.show();
		System.out.println();
		person3.show();
		System.out.println();
		person4.show();
		
	}
	
	
	public  String[] sortingString(String array[][],int col)
	{
		char str[]={'A','2','3','4','5','6','7','8','9','1','J','K','Q'};
		int index=0;
		String newArr[]=new String[9];
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(str[i]==array[j][col].charAt(0))
				{
					newArr[index]=array[j][col];
					array[j][col]="";
					index++;
				}
			}
		}
		return newArr;
	}


}

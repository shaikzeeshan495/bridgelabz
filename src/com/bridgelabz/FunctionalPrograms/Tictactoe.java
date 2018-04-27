package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.utility.Utility;

public class Tictactoe {
	
	static String turn="";
	
	public static void main(String []args)
	{
		String array[][]=new String[3][3];
		
		game(array);
	}
	
		static void game(String array[][])
		{
			String ch="X";
			String ch2="O";
			System.out.println("enter coloumn");
			int m=Utility.inputInteger();
			System.out.println("enter row");
			int n=Utility.inputInteger();
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(turn==ch)
					{
					array[i][j]=ch;
					turn=ch2;
					}
					else
					{
					array[i][j]=ch2;
					turn=ch;
					}
				}
			}
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
	/*		String winner=checkwinner(array,turn);
			if(winner=="computer")
				System.out.println("winner is "+winner);
			else
				System.out.println("winner is "+winner);	*/
			
		}
		
	/*	static String checkwinner(int a[][],char turn)
		{
			String check=null;
			String winner=null;
			if(turn=='X')
			{
				check="OOO";
				winner="computer";
			}
			else
			{
				check="XXX";
				winner="USER";
			}
			
			if(check.equals(a[0][0]+a[0][1]+a[0][2]))
				return winner;
			else if(check.equals(a[0][0]+a[1][1]+a[2][2]))
				return winner;
			else if(check.equals(a[0][0]+a[1][0]+a[2][0]))
				return winner;
			else if(check.equals(a[0][0]+a[1][0]+a[2][0]))
				return winner;
			else if(check.equals(a[0][2]+a[1][1]+a[2][0]))
				return winner;
			else if(check.equals(a[0][2]+a[1][2]+a[2][2]))
				return winner;
			else if(check.equals(a[2][0]+a[2][1]+a[2][2]))
				return winner;
			else
				game(a);
			return "";
			
		}	*/
		}
}

package com.prowings.one;

public class OneDaimentionalArray
{
	
	public static void main(String[] args) 
	{
		int[] arr = {12,34,45,65,23};
		int i;
		for(i = 0; i<=4; i++)
		{
			System.out.print(" " +arr[i]);
		}
		
		System.out.println();
		
		for(i = 4 ; i>=0 ; i--)
		{
			System.out.print(" "+arr[i]);
		}
	}

}

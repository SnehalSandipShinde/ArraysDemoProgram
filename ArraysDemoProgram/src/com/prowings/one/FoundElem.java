package com.prowings.one;

public class FoundElem {
	
	public static void main(String[] args) {
		int arr[] = {2010,2013,2014,2015,2014};
		
		int elem = 2010;
		int count = 0;
		
		for(int i : arr)
		{
			if(i!=elem)
			{
				continue;
//				count++; //Unreachable code
			}
			count++;
		}
		System.out.println("count of years: "+count );
	}

}

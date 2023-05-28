package com.prowings.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(12);
		arrList.add(23);
		arrList.add(22);
		arrList.add(43);
		
		long cnt = arrList.stream()
				.count();
		
		System.out.println(cnt);
		
		List<Integer> list =  arrList.stream().filter(i -> i>=22).collect(Collectors.toList());
		System.out.println(list);
		
		
	}
}

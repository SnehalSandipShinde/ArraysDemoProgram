package com.prowings.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		
		Integer[] arr = {1,0,0,1,0,1,1};
		
//		ArrayList<Integer> nums = (ArrayList<Integer>) Arrays.asList(arr);
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(Integer elem : arr)
		{
			nums.add(elem);
		}
		
		System.out.println(nums);
		
		
		Arrays.sort(arr);
		System.out.println(Arrays.asList(arr));
		
		long total = Arrays.stream(arr)
                .filter(i -> i == 1)
                .count();
		
		System.out.println("Count of 1's in given array is "
                + total);
		
		List<Integer> list = Arrays.stream(arr)
        .filter(i -> i == 1).collect(Collectors.toList());
		
		System.out.println(list);
	}
}

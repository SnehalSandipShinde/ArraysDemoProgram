package com.prowings.one;

import java.util.Arrays;

public class MissMatchDemo {
	
	public static void main(String[] args) {
		
		int[] numbers1 = {3,4,5,6,1,5};
		int[] numbers2 = {3,4,5,6,1,5};
		int[] numbers3 = {3,4,5,6,1,3,7};
		int[] numbers4 = {7,4,5,6,1,5};
		
		int missMatch1 = Arrays.mismatch(numbers1, numbers2);
		int missMatch2 = Arrays.mismatch(numbers1, numbers3);
		int missMatch3 = Arrays.mismatch(numbers1, numbers4);
		
		System.out.println(missMatch1 +"------"+missMatch2+"------"+missMatch3+"------");
		
	}

}

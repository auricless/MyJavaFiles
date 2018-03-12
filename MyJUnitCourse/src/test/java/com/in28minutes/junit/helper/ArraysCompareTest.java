package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {
	
	@Test
	public void testSortArray_RandomArray() {
		int[] num = {1, 5, 4, 3};
		int[] exp = {1, 3, 4, 5};
		
		Arrays.sort(num);
		
		assertArrayEquals(exp, num);
	}

	@Test(expected = NullPointerException.class)
	public void testSortArray_NullArray() {
		int[] num = null;
		Arrays.sort(num);
		
		//assertArrayEquals(exp, num);
	}
	
	@Test(timeout = 100)
	public void testSort_Performance() {
		int[] arr = {12, 24, 7};
		for(int i = 1; i < 1000000; i++) {
			arr[0] = i;
			Arrays.sort(arr);
		}
	}
	
}

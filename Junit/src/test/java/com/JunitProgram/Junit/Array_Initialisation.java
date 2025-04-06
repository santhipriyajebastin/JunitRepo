package com.JunitProgram.Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class Array_Initialisation {

	@Test
	//this function checks the direct initialization array.using assertarrayequals checking 
	public void testDirect_Initialization() {
		int[] array= {1,2,3,4,5};
		int[] expected = {1,2,3,4,5};
		assertArrayEquals(expected,array,"array should have the values {1,2,3,4,5}");
	}
	@Test
	public void testarray_withnewkeyword() {
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		assertArrayEquals(new int[] {1,2,3,4,5},arr,"rray should contain the values[1,2,3,4,5]");
		
	}
	@Test
	public void testarray_intilizationwithmutlideimnsion() {
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		int[][] expected =  {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		assertArrayEquals(expected,matrix,"Array should contain values {1,2,3},{4,5,6},{7,8,9}");
	}
	@Test
	public void arrayFill() {
		int[] arr = new int[5];
		//Arrays.fill(arr, 42);
		Arrays.fill(arr, 42);
		int[] expected = {42,42,42,42,42};
		assertArrayEquals(expected,arr,"All element should filled with the values 42");
	}
	@Test
	public void testarraystream() {
		//int[] array = IntStream.range(0, 5).toArray();
		int[] array = IntStream.range(0,5).toArray();
		assertArrayEquals(new int[] {0,1,2,3,4},array,"Array should contain [0,1,2,3,4]");
		
		
		int[] ARRAY=IntStream.range(0,5).toArray();
	}
	

}

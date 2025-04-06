package com.JunitProgram.Junit;

import java.util.Arrays;

public class Q4_Removenull {
	
	public static Integer[] removenull(Integer[] array) {
		return Arrays.stream(array)
					.filter(x -> x!= null)
					.toArray(Integer[]:: new);
	}
	
//	public static Integer length(Integer[] array) {
//		int count = 0;
//		for(Integer a:array) {
//			if(a!=null) {
//				count++;
//			}
//		}
//		return count;
//	}
//	
//	public static void main(String[] args) {
//		Integer[] array = {1,2,null,3};
//		int length = length(array);
//		System.out.println(length);
//		Integer[] newarray = new Integer[length];
//		int index=0;
//		for(Integer arr:array) {
//			if(arr!=null) {
//				newarray[index++] = arr;
//			}
//		}
//		System.out.println(Arrays.toString(newarray));
//		
//	}
}

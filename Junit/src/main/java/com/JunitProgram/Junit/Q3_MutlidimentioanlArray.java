package com.JunitProgram.Junit;

import java.util.Scanner;

public class Q3_MutlidimentioanlArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Collect dimensions
        System.out.print("Enter number of dimensions: ");//3
        int dimensions = scanner.nextInt();

        // Step 2: Validate dimensions input
        if (dimensions <= 0) {
            System.out.println("Invalid number of dimensions.");
            return;
        }

        // Step 3: Create array with dynamic dimensions
        int[] size = new int[dimensions];//int[3]
        for (int i = 0; i < dimensions; i++)
        {
            System.out.print("Enter size for dimension " + (i + 1) + ": ");
            size[i] = scanner.nextInt();//size[2][2][2]
        }
        

        // Step 4: Create a multi-dimensional array
        Object array = createArray(size, 0);//2,0

        // Example: Filling array with values (if applicable)
        System.out.println("Array dimensions created successfully!");
    }

    // Recursively creates multi-dimensional array based on sizes
    private static Object createArray(int[] size, int index) {//2,0//2,1
        if (index == size.length - 1) {//index0 = 3-1=2//
            return new int[size[index]]; // Return an array of integers at the last dimension//new int[size[3]];
        }
        System.out.println("before index"+index);
        Object array = createArray(size, index + 1);//createArray(3,1)//(3,2)//(3,3)
        System.out.println("after index"+index);
        System.out.println("sie[Index]"+size[index]);
        return java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), size[index]);
    }
}
	



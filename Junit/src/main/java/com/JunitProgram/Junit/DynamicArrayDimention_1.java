package com.JunitProgram.Junit;

import java.util.Scanner;

import java.lang.reflect.Array;
import java.util.Scanner;

public class DynamicArrayDimention_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Collect dimensions
        System.out.print("Enter number of dimensions: ");
        int dimensions = scanner.nextInt();
        
        // Step 2: Validate the input dimensions
        if (dimensions <= 0) {
            System.out.println("Invalid number of dimensions.");
            return;
        }
        
        // Step 3: Collect sizes for each dimension
        int[] sizes = new int[dimensions];
        for (int i = 0; i < dimensions; i++) {
            System.out.print("Enter size for dimension " + (i + 1) + ": ");
            sizes[i] = scanner.nextInt();
        }
        
        for(int size:sizes) {
        	System.out.print(size + " ");
        }
        
        // Step 4: Create the multi-dimensional array
        Object array = createArray(sizes, 0);
        
//         Step 5: Print the dimensions of the created array
        printArrayDimensions(array, sizes, 0);
    }

    // Recursively create a multi-dimensional array
    private static Object createArray(int[] sizes, int index) {//3,0
        if (index == sizes.length - 1) {
            return new int[sizes[index]];  // Create an array at the last dimension
        }

        Object array = createArray(sizes, index + 1);
       
        return Array.newInstance(array.getClass().getComponentType(), sizes[index]);
    }

    // Recursively print the dimensions of the array
    private static void printArrayDimensions(Object array, int[] sizes, int index) {
        System.out.print("Array dimension " + (index + 1) + " size: " + Array.getLength(array));
        System.out.println();
        
        if (index < sizes.length - 1) {
            Object subArray = Array.get(array, 0);
            printArrayDimensions(subArray, sizes, index + 1); // Print next dimension
        }
    }
}

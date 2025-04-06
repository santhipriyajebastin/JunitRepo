package com.JunitProgram.Junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Dynamic3DArraytest {
	private Dynamic3DArray Dynamic3DArray;
	@BeforeEach
	public void setup() {
		Dynamic3DArray = new Dynamic3DArray();
	}

	//test to add complete array1
	@Test
    public void testDefaultValueOnUninitializedColumns()
    {
    	 // Add elements and access uninitialized column
		Dynamic3DArray.addElement(0, 0, 0, 15);
		Dynamic3DArray.addElement(0, 0, 2, 25);
        
        // Access a column that hasn't been set yet
        assertEquals(0, Dynamic3DArray.getElement(0, 0, 1), "Uninitialized column should have a default value of 0");
    }
	
	@Test
	public void TestAddAndGetElement() {
		Dynamic3DArray.addElement(1, 0, 1, 10);
		Dynamic3DArray.addElement(1, 0, 2, 20);
		
		assertEquals(10,Dynamic3DArray.getElement(1, 0, 1), "should have value as 10");
		assertEquals(20,Dynamic3DArray.getElement(1, 0, 2), "should have value as 20");
	}
	
	@Test
	public void TestRemoveelement() {
		Dynamic3DArray.addElement(1, 0, 1, 10);
		assertEquals(10,Dynamic3DArray.getElement(1, 0, 1), "should have value as 10");
		
		Dynamic3DArray.deleteElement(1, 0, 1);
		
		String expected = "Layer is 1 row is 0 value at column is [0]";
		String Actual = Dynamic3DArray.outputtostring();
			
		
		assertEquals(expected,Actual, "10 should not be present after deletion");
		
	}
		
		
	}



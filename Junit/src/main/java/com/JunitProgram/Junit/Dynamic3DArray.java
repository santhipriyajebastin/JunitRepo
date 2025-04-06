package com.JunitProgram.Junit;

import java.util.ArrayList;
import java.util.List;
//dynamic3DArray.addElement(0, 0, 0, 10)

public class Dynamic3DArray {
	
	public static void main(String[] args) {
		Dynamic3DArray obj = new Dynamic3DArray();
		//obj.addElement(0,0,0,10);
		obj.addElement(1,0,1,10);
		//obj.printarray();
	//	System.out.println(obj.getElement(0, 0, 0));
		obj.deleteElement(1,0,1);
	//	obj.printarray();
		String result = obj.outputtostring();
		System.out.println(result);
	}
 private List<List<List<Integer>>> dynamicArray;

	    public Dynamic3DArray()
	    {  
	        dynamicArray = new ArrayList<>();   
	    }
	    //*************************************
	    public void addLayer(int layerIndex)//(3)
	    {
	    while (dynamicArray.size() <= layerIndex)//0<=0
	    {
	    dynamicArray.add(new ArrayList<>());//[]creates empty array
	    }
	    }
	    //*************************************
	    public void addRow(int layerIndex, int rowIndex)//(0,0)
	    {
	        addLayer(layerIndex); // Ensure layer existsn addLayer(0)->(2)
	        List<List<Integer>> layer = dynamicArray.get(layerIndex);
	        while (layer.size() <= rowIndex)
	        {
	        	layer.add(new ArrayList<>());
	        }
	    }
	    //**************************************************
	    public void addElement(int layerIndex, int rowIndex, int colIndex, int value)//(0,0,0,10)
	    {
	        addRow(layerIndex, rowIndex); // Ensure row exists//addRow(0,0)->(1)
	        List<Integer> row = dynamicArray.get(layerIndex).get(rowIndex);
	        // Ensure column exists at the specified index
	        while (row.size() <= colIndex) {
	        	row.add(0); // Default value (0) for new columns
	        }
	        
	        // Set the element at the specified position
	        row.set(colIndex, value);
	        System.out.println(dynamicArray);
	        System.out.println(dynamicArray.size());

	    }
	    //*****************************************************
	    public int getElement(int layerIndex, int rowIndex, int colIndex)
	    {
	        return dynamicArray.get(layerIndex).get(rowIndex).get(colIndex);

		}
	    //*************************************************************
	    public void deleteElement(int layerIndex,int rowIndex,int columnIndex) {
			
	    	dynamicArray.get(layerIndex).get(rowIndex).remove(columnIndex);
			System.out.println("Dynamic 3D array is " + dynamicArray );
		}
	        

	    public void printarray() {
			for(int i=0;i<dynamicArray.size();i++) {
				List<List<Integer>> layer = dynamicArray.get(i);
				for(int j=0;j<layer.size();j++) {
					List<Integer> value = layer.get(j);
					System.out.println("Layer is " + i + " row is " + j +" value at column is " + value);
				}
			}
		
	    }
	    public String outputtostring() {
	    	StringBuilder sb = new StringBuilder();
	    	for(int i=0;i<dynamicArray.size();i++) {
				List<List<Integer>> layer = dynamicArray.get(i);
			//	sb.append("layer is").append(i);
				for(int j=0;j<layer.size();j++) {
					List<Integer> value = layer.get(j);
					sb.append("Layer is ").append( i).append(" row is ").append( j).append(" value at column is ").append( value).append("\r\n");
				}
	    	}
	    	return sb.toString();
	    	}
	    
	
}



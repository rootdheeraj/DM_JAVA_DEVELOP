package com.io_demo_205;

import java.io.*; // Accessing FileReader, FileWriter, IOException
	
	// Java Program illustrating that we can read a file in 
	// a human readable format using FileReader 
	 
public class DeleteLater2 {
	
	public static void main(String[] args) throws IOException {
		
			FileReader sourceStream = null; 
			try
			{ 
				sourceStream = new FileReader("input.txt"); 
				
				// Reading sourcefile and writing content to target file character by character. 
				int temp; 
				while ((temp = sourceStream.read()) != -1) 
					System.out.print((char)temp); 
			}
			finally
			{			 
				// Closing stream as no longer in use 
				if (sourceStream != null)			 
					sourceStream.close();		 
			} 
		} 
}
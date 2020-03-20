package com.io_demo_205;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Delete_ReadTxtFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		try {
			fr = new FileReader("input.txt");
			int i = fr.read();
			while(i!= -1)
			{
				System.out.print((char)i);
				i = fr.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			if (fr != null) {
				fr.close();
			}else {
				System.out.println("fr didnt found the file to read");
			}
			
		}
		
	}
	
}

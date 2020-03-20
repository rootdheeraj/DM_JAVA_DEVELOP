package com.io.practice;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadTxtFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Mehta_d\\Desktop\\note.xml");
		
		int i = fis.read();
		while(i!=-1) {
			
			System.out.print((char)i);
			i=fis.read();
		}
		
		fis.close();
		System.out.println();
//		System.out.println("Time taken by the program " + System.nanoTime()/1000000 + "ms");
	}
}
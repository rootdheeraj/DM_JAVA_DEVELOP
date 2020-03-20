package com.io.practice;

import java.io.FileReader;
import java.io.IOException;

public class ReadTxtFileReaderClass {
	
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("C:\\Users\\Mehta_d\\Desktop\\input.txt");
		int i = fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
	}
}
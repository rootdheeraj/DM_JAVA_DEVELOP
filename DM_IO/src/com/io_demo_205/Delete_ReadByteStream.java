package com.io_demo_205;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Delete_ReadByteStream {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			
			fis = new FileInputStream("input.txt");
			fos = new FileOutputStream("output.txt");
			
			int i = fis.read();
			while(i!=-1) {
				
				System.out.print((char)i);
				fos.write((byte)i);
				i = fis.read();
			}
		}
		finally {
			if(fis != null)
			{
				fis.close();
			}
			if(fos !=null) {
				fos.close();
			}
		}
	}
}
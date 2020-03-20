package com.io.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTxtFile {
	
	public static void main(String[] args) throws IOException{

		File file = new File("d:\\output.txt");
		FileOutputStream fop = new FileOutputStream(file);
		
		String content = "This is the text content";

			// if file doesnt exists, then create it
//			if (!file.exists()) {
//				file.createNewFile();
//			}

			// get the content in bytes
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
//			fop.flush();
			fop.close();

			System.out.println("Done");

				if (fop != null) {
					fop.close();
				}
			}
		}
package com.io_demo_205;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Delete_ReadBSDemo {

    public static void main(String[] args) throws IOException 
    { 
        FileInputStream fis = null; 
        FileOutputStream fos = null; 
  
        try 
        { 
            fis = new FileInputStream("sorcefile.txt"); 
            fos = new FileOutputStream ("targetfile.txt"); 
  
            // Reading source file and writing content to target 
            // file byte by byte 
            int i; 
            while ((i = fis.read()) != -1) 
                fos.write((byte)i);             
        } 
        finally 
        { 
            if (fis != null) 
                fis.close();             
            if (fos != null)             
                fos.close();             
        } 
    } 
	
}

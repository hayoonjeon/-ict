package com.ict.day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex99 {
	public static void main(String[] args) {
	
		Path path = Paths.get("D:","Hayoon","util","0822-4.jpg");
		String pathName = path.toString();
		File file = new File(pathName);
		
		PrintStream ps = null;
		
		try {
			ps = new PrintStream(new FileOutputStream(file),true);
			ps.println("Hello, World");
			ps.println(100);
			ps.print('C');
			ps.print(45.987);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
				
		
	}

}

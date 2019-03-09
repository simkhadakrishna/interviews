package com.krish.interview.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\simkh\\stud.txt");
		
		String str = "I am working on java.";
		
		byte[] b = str.getBytes();
		fout.write(b);
		fout.close();
		
		System.out.println("information is saved in the file.");
	}

}

package com.krish.interview.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\simkh\\stud.txt");
		
		int i = 0;
		
		while((i = fin.read())!=-1) {
			System.out.print((char)i);
		}
	}

}

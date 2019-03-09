package com.krish.interview.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutput {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\simkh\\bstud.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		String str = "I am java, I am in new page.";
		byte[] b = str.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		}

}

package misc.arraylist.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializationDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<String> arrList = null;
		
		FileInputStream fis = new FileInputStream("C:\\Users\\simkh\\OneDrive\\Desktop\\abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		arrList = (ArrayList<String>) ois.readObject();
		fis.close();
		ois.close();
		
		for (String string : arrList) {
			System.out.println(string);
		}
	}

}

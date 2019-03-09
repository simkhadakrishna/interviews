package misc.arraylist.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerialization {
	public static void main(String[] args) throws IOException {
		
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("raju");
		arrList.add("Hari");
		arrList.add("sam");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\simkh\\OneDrive\\Desktop\\abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(arrList);
		fos.close();
		oos.close();
	}

}

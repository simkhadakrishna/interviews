package com.krish.interview.collections;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {

			List<String> arrList = new ArrayList<String>();
			arrList.add("ram");
			arrList.add("sam");
			arrList.add("hari");
			arrList.add("shiva");
			
			System.out.println(arrList);
			//convert int Array
			//First declare the Array
			String arr[] = new String[arrList.size()];
			
			for(int i = 0; i<=arrList.size()-1; i++) {
				arr[i]=arrList.get(i);
			}
			for (String s : arr) {
				System.out.println(s);
			}
	}

}

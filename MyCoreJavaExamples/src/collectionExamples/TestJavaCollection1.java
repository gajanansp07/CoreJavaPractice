package collectionExamples;

import java.util.*;

class TestJavaCollection1 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating array list
		list.add("Ravi");// Adding object in array list
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
//Traversing list through Iterator  
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
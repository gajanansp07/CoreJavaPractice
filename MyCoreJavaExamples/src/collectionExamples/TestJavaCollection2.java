package collectionExamples;
import java.util.*;

public class TestJavaCollection2 {
	public static void main(String[] args) {
		LinkedList <String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Mahesh");
		ll.add("Ajay");
		ll.add("Ravi");
		ll.add("Mahesh");
		
		System.out.println("Size of Linked List : "+ ll.size());
		
		Iterator <String> it = ll.iterator();
		
		System.out.println("List Elements : ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

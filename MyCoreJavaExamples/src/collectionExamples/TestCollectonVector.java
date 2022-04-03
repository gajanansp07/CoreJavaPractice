package collectionExamples;

import java.util.Iterator;
import java.util.Vector;

public class TestCollectonVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> v = new Vector<String>();
		v.add("Ganesh");
		v.add("Mahesh");
		v.add("Somnath");
		v.add("Mahesh");
		v.add("Madhav");
		System.out.println("Size of Vector : " + v.size());
		
		Iterator<String> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}

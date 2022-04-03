package collectionExamples;
import java.util.Iterator;
import java.util.Stack;

public class TestCollectionStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack <String>();
		st.add("Mahesh");
		st.add("Soma");
		st.add("Madhav");
		st.add("Ganesh");
		st.add("Mahesh");
		st.add("Ramarao");
		System.out.println("Size of Stack : "+ st.size());
		System.out.println("Capacity of Stack : "+ st.capacity());
		st.pop();
		Iterator<String> itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		st.push("Ramarao");
		System.out.println("After Push Element : " );
		itr = st.iterator();
		try {
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}

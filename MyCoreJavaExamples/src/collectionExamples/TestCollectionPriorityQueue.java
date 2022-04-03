package collectionExamples;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestCollectionPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Mahesh");
		pq.add("Ramarao");
		pq.add("Ganesh");
		pq.add("Somnath");
		pq.add("Gitimoni");
		System.out.println("Size of Priority Queue : "+ pq.size());
		Iterator <String> itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

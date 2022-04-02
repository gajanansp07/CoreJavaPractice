package sathyaquetionpapers;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>list = new ArrayList <Integer>();
		list.add(100);
		list.add(20);
		list.add(0);
		list.add(28);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}

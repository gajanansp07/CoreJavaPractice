package syntaxCheckingandExam;

import java.util.ArrayList;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6,8,9};
		List <Integer> list =new ArrayList<>();
		list.add(array[0]);
		list.add(array[1]);
		list.add(array[2]);
		list.set(1, array[1]);
		list.remove(0);
//		System.out.println(list);//syntaxCheckingandExam java.lang.Error: Unresolved compilation problem: 
		

	}

}

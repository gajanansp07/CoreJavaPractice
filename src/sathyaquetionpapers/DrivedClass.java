package sathyaquetionpapers;

import java.util.Scanner;

public class DrivedClass extends BaseClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BaseClass b = new BaseClass();
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		System.out.println("Squer : "+ b.squer(n));
		System.out.println("Cube : "+ b.cube(n));
	}

}

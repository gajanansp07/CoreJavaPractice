package sathyaquetionpapers;

import java.util.Scanner;

public class PrimeOrNot {
	//List of prime numbers 
	//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int i;
		boolean flag=false;
		for(i=2;i<=n/2;i++)
			if(n%i==0)
				flag=true;
		if(flag)
			System.out.println(n+" is not Prime...");
		else 
			System.out.println(n+" is Prime");
			

	}

}

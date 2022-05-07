package Sathya;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number to check Prime or Not : ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		for(i=2;i<n;i++) {
			if(n%i==0)
				break;
		}
		if(i==n)
			System.out.println(n+" is Prime Number");
		else
			System.out.println(n+" is not a Prime Number");
	}

}

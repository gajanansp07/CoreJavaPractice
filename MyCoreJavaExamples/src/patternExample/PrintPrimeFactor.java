package patternExample;

import java.util.Scanner;

public class PrintPrimeFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to get Prime factors : ");
		factors(sc.nextInt());	

	}

	private static void factors(int n) {
		
		if(n<=1) {
			System.out.println("Number is : "+n);
			return;
			}
		System.out.print("Prime factors are : ");
		for(int i=2;i*i<=n;i++) {
			while(n%i==0) {
				System.out.print(i+", ");
				n=n/i;
			}
		}
		if(n>1)
			System.out.println(n);		
	}

}

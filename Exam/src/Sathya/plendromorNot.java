package Sathya;

import java.util.Scanner;

public class plendromorNot {

	public static void main(String[] args) {
		System.out.println("Enter a Number is Palendrom or not : ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int temp =n;
		int r,rev=0;
		while(n>0) {
		r=n%10;
		rev = rev*10+r;
		n=n/10;	
	}
	if(rev==temp)
		System.out.println(temp+" Given Number is Palendrom");
	else
		System.out.println(temp+" Given Number is not Palendrom");
}
}
package multiThreadingExample;

import java.util.Scanner;

public class SumofN_Numbers {
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread Strated : ");
		System.out.println("Enter n Value : ");
		try (Scanner sc = new Scanner(System.in)) {
			n= sc.nextInt();
		}
		Custom c1 = new Custom();
		c1.start();
		try {
			c1.join();
		}catch(Exception e) {}
		System.out.print("Sum of N numers : "+Custom.sum);
	}

}
class Custom extends Thread
{
	static int sum=0;
	public void run() {
		for(int i=1;i<=SumofN_Numbers.n;i++)
		{
			sum+=i;
		}
		
	}
}

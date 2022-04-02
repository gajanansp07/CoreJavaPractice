//
package sathyaquetionpapers;

public class ComplexQue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,6,8,4,2,5,46,45,1,9},sum=0;
		//find sum of even location digits
		for(int i=0;i<a.length;i+=2)
			if(i%2==0)
				sum +=a[i];
		//get last digit of sum and mutiply by 5
		sum = (sum%10)*5;
		//find sum of odd location elements and add to digit
		for(int i=1;i<a.length;i+=2)
			if(i%2!=0)
				sum +=a[i];
		//get last digit
		sum = sum%10;
		//if digit is even then find factorial of that digit
		//if not find the factors for that digit
		if(sum%2==0) {
			int fact=1;
			System.out.println("Digit is even and factoril is : ");
			for(int i=1;i<=sum;i++)
				fact *= i;
			System.out.print(sum);
		}
		else {
			System.out.println("Digit is odd and factors are :");
			for(int i=1;i<=sum;i++)
				if(sum%i==0)
					System.out.println(i);
		}
				

	}

}

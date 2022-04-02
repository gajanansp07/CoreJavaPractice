package sathyaquetionpapers;

public class ComplexQn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,5,3,2,3,9,2,7,2};
		//find the largest element in array
		int l=arr[0],sum=0;
		int x = 0,y = 0,z;
		for(int i=1;i<arr.length;i++)
			if(l<arr[i])
				l=arr[i];
		System.out.println("Large : "+l);
		// Add middle element to largest element and store it into
		// if middle element is not present then find avg of middle number and store it into larget element
		if(arr.length%2!=0)
			x = arr[arr.length/2];
		else
			x = ((arr[arr.length/2])+(arr[(arr.length/2)-1]))/2;
		System.out.println("Middle NO : "+x);
		x+=l;
		for(int i=0;i<arr.length;i++)
			sum +=arr[i];
		System.out.println("SUM = "+sum);
		y = sum/arr.length;
		System.out.println("X = "+x+" Y = "+y);
		z = x*y;
		System.out.println("Z = "+z);
		//check z is prime or not
		int i;
		for(i=2;i<=z;i++)
			if(z%i==0)
				break;
		if(z==i)
			System.out.println(z+" is a prime Number");
		else
			System.out.println(z+" is a Not prime Number");

	}

}

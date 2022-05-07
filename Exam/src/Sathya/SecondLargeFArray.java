package Sathya;

public class SecondLargeFArray {
	public static void main(String[] args) {

		int []arr = {1,2,3,4,5,6,7,8,9};
		int l=arr[0];
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++)
			if(arr[i]<arr[j]) {
				l=arr[j];
				arr[j]=arr[i];
				arr[i]=l;
				
			}
			
		}
			System.out.print("Second Large no is : "+arr[1]);
	}

}

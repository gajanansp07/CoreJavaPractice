package arrayExaple;

public class SwapArrayElements {

	public static void main(String[] args) {
		// program to swap array elements
		int[] arr = {50,60,32,456,34,10,30,50,28,22,40};
		System.out.println("Befor Swaping : ");
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
		
		for (int i=0,j=(arr.length-1);i<j;i++,j--) {
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
		}
		System.out.println("After Swaping : ");
		for(int x:arr)
			System.out.print(x+" ");
	}

}

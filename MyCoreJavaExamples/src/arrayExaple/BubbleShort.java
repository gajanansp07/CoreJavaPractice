package arrayExaple;

public class BubbleShort {

	public static void main(String[] args) {
		// Bubble short
		int[] arr = {50,60,32,456,34,10,30,50,28,22,40,50};
		System.out.println("Befor shorting");
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
		//arr.length - 1 : because last element will shorted in inner loop
		for(int i=0; i<arr.length-1;i++) {
			//arr.length-1-i Because every time last element get short listed 
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}			
		}
		
		System.out.println("After Shortlisted : ");
		for(int i=0;i<arr.length; i++)
			System.out.print(arr[i]+" ");

	}

}

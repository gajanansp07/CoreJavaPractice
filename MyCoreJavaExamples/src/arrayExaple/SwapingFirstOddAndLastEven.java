package arrayExaple;

public class SwapingFirstOddAndLastEven {

	public static void main(String[] args) {
		// Swap last element even and first odd
		int[] arr = {6,2,4,9,3,5,6,3,8,7,0,8,3,5,};
		int x=0,y=0;
		System.out.println("Element Before Swaping");
		for(int n : arr ) {
			System.out.print(n+" ");
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				x=i;
				break;
			}
		}
		for(int i=arr.length-1; i>=0;--i) {
			if(arr[i]%2==0) {
				y=i;
				break;
			}
		}
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		System.out.println();
		System.out.println("Elements After Swaping");
		for(int n:arr) {
			System.out.print(n+" ");
		}
	}

}

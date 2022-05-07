package recursion;

public class FibonanciSeriseUsingRec {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=10,n1=0,n2=1;
		fibo(count,n1,n2);

	}

	private static void fibo(int count, int n1, int n2) {
		if(count>0) {
			System.out.print(n1+" ");
			fibo(count-1,n2,n1+n2);
		}
	}
}

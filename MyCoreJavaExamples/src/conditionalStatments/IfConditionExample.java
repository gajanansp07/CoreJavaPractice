package conditionalStatments;

public class IfConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is simple if Condition");
		int x=10;
		if(x==10) {
			System.out.println("Yes this is ok and X = "+x);
		}
		x=8;
		System.out.println();
		if(x!=10) {
			System.out.println("This is not OK Becose X = "+x);//will execute only condition fails
		}

	}

}

package syntaxCheckingandExam;

public class Grasshopper {
	private String name;
	public Grasshopper(String nm) {
		name = nm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grasshopper one = new Grasshopper("m1");
		Grasshopper two = new Grasshopper("m2");
		one=two;
		two=null;
		one=null;
	}

}

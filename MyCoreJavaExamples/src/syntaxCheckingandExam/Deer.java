package syntaxCheckingandExam;

public class Deer {
	public Deer() {System.out.print("Deer");}
	public Deer(int age) {System.out.print("DeerAge");}
	private boolean hasHorns() {return false;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer deer = new Reindeer(5);
		System.out.print(","+deer.hasHorns());
	}

}
class Reindeer extends Deer{
	public Reindeer(int age) {System.out.print("Rendeer");	}
	public boolean hasHorns() {return true;}
}

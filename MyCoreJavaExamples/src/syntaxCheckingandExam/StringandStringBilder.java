package syntaxCheckingandExam;

public class StringandStringBilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb = new StringBuilder();
		sb.append("Ja").append("va");
		System.out.println(s1==s2);
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("sb = "+sb);
		System.out.println(s1.equals(s2));
		System.out.println(sb.toString()==s1);
		System.out.println(sb.toString().equals(s1));
		try {
		//System.out.println(sb==s2);//Incompatible operand types StringBuilder and String

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

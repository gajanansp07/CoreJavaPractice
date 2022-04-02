package sathyaquetionpapers;

public class PrintLenthOfaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Q.5 : Output : ");
		String obj="I Like Shilpa";
		System.out.println(obj.charAt(3));
		System.out.print("Q.6 : Output : ");
		System.out.println("Lenth of obj : "+obj.length());
		System.out.print("Q.7 : Output : ");
		String s ="AMAR";
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));
		System.out.println();
		System.out.print("Q.8 : Output : ");
		String str = "Gitimoni is my cat";
		String []arr = str.split(" ");
		for(String ele : arr)
			System.out.print(ele.charAt(0));
		String rev="";
		System.out.println();
		System.out.print("Q.9 : Output : ");
		for(int i=s.length()-1;i>=0;i--)
			rev += s.charAt(i);
		System.out.println(rev);
		
		System.out.print("Q.10 : Output : ");		
		String s1 ="Sathya";
		String s2 ="Sathya";
		System.out.println(s1=s2);

		System.out.print("Q.11 : Output : ");		
		String st1 = new String("Sathya");
		String st2 = new String(s1);
		System.out.println(st1==st2);
		
		System.out.print("Q.12 : Output : ");
		String s121 ="java";
		String s122 = "java";
		System.out.print(s121.equals(s122)+" ");
		System.out.println( s121==s122);
		
		System.out.print("Q.13 : Output : ");
		String s131 = "Sathya";
		String s132 = "Tech";
		System.out.print((s131.charAt(0) > s132.charAt(0))+" ");
		System.out.println(s131.charAt(s1.length()-1)>s131.charAt(s2.length()-1));
		
		System.out.print("Q.14 : Output : ");
		
		

	}

}

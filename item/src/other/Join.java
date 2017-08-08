package other;


public class Join {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = new String("hello");
		String s4 = "hello";
		boolean a = s1==s2;
		boolean b = s2==s3;
		boolean c = s1==s4;
		System.out.println(a+" "+b+" "+c);
	}

}

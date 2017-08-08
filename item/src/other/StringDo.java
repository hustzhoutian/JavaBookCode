package other;


public class StringDo {
	public static void main(String[] args) {
		String str = "hello word";
		String substr = str.substring(6,10);
		System.out.println(substr);	
		String str1 = "  i am  zhoutian    ";
		System.out.println(str1.length());
		System.out.println(str1.trim().length());
		String str2 = "a dd ress";
		String str3 = "address     ";
		String newstr = str2.replace("d","D");
		System.out.println(newstr);
		boolean b = str.startsWith("h");
		boolean b1 = str1.startsWith("  ");
		boolean b2 = str1.startsWith("   ");
		boolean b3 = str2.startsWith("A");
		System.out.println(b+" "+b1+" "+b2+" "+b3);
		boolean b4 = str.equals(str1);
		boolean b5 = str.equals(str);
		boolean b6 = str2.equalsIgnoreCase(str3);
		System.out.println(b4+" "+b5+" "+b6);
		System.out.println(str2.compareTo(str3));
		System.out.println(str2.toUpperCase());
		System.out.println(str3.toUpperCase());
		String[] firstArray = str2.split(" ");
		for(String a:firstArray){
			System.out.print(a+" ");
		}
	}

}

package other;


public class Judge {
	public static void main(String[] args) {
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String str1 = "aaa@";		
		String str2 = "aaaaa";
		String str3 = "1111@111af.com.cn";
		if(str1.matches(regex)){
			System.out.println(str1+"合法e-mail地址");
		}
		if(str2.matches(regex)){
			System.out.println(str3+"合法e-mail地址");
		}
		if(str3.matches(regex)){
			System.out.println(str3+"合法e-mail地址");
		}
	}

}

package HomeWork;

public class Test5_9_1234 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//5.9.1
		String str = "ABC123abc";
		String UpStr = str.toUpperCase();
		String LowStr = UpStr.toLowerCase();
		System.out.println(UpStr+"\n"+LowStr);
		//5.9.2
		String str1 = "123456789";
		String str2 = "123456123";
		if(!(str1.substring(0, 9).equals(str2.substring(0,9)))){
			System.out.println("�Ӵ���ͬ");
		}
		if(str1.substring(0, 6).equals(str2.substring(0,6))){
			System.out.println("�Ӵ���ͬ");
		}
		//5.9.3
		String regex = "1\\d{10}";
		String number1 = "13007194261";
		String number2 = "sdfasdfasdf";
		String number3 = "1sadfad32";
		String number4 = "130000000000";
		String number5 = "23000000000";
		if(number1.matches(regex)){
			System.out.println("1�Ϸ��ֻ�����");
		}
		if(number2.matches(regex)){
			System.out.println("2�Ϸ��ֻ�����");
		}
		if(number3.matches(regex)){
			System.out.println("3�Ϸ��ֻ�����");
		}
		if(number4.matches(regex)){
			System.out.println("4�Ϸ��ֻ�����");
		}
		if(number5.matches(regex)){
			System.out.println("5�Ϸ��ֻ�����");
		}
		//5.9.4
		StringBuilder strb = new StringBuilder("����1-10��");
		for (int i = 1; i < 11; i++) {
			strb.append(i);			
		}
		System.out.println(strb);
	}

}

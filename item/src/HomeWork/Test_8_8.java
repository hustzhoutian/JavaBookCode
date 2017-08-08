package HomeWork;


import other.Integer1;

public class Test_8_8 {
	public static void main(String[] args) {
		Integer1 integer = new Integer1(7);
		System.out.println(integer.getInt());
		
		//8.8.2
		Character character1 = new Character('s');
		Character character2 = new Character('S');
		System.out.println(character1.equals(character2));
		Character a = Character.toLowerCase(character2);
		Character b = 's';
		System.out.println(character2.charValue());
		System.out.println(character1.equals(b));
		
		//8.8.3
		Boolean bool1 = new Boolean(false);
		System.out.println(bool1.toString());
	}
		
}

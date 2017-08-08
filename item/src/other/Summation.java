package other;


public class Summation {

	public static void main(String[] args) {
		Integer number1 = new Integer(7);
		Integer number2 = new Integer("123");
		String[] str = new String[]{"23","32","31","53","98"};
		int sum = 0;
		for (int i = 0; i < str.length; i++) {
			int myint = Integer.parseInt(str[i]);
			sum = sum +myint;
		}
		System.out.println(sum);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		Boolean bool = new Boolean(true);
		System.out.println(bool);
		
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);
	}

}

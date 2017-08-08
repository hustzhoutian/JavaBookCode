package other;


public class MathRondom {
	
	public static int GetEvenNum(double num1,double num2){
		int s = ((int)num1+(int)(Math.random()*(num2-num1+1)));
		if (s%2==0) {
			return s;
		}else {
			return s+1;
		}		
	}
	
	public static char GetRandomChar(char char1,char char2) {
		return (char) (char1+Math.random()*(char2-char1+1));		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for (int i = 0; i < 100; i++) {
			System.out.println(GetEvenNum(2, 32));
			System.out.println(GetRandomChar('0', '9'));
		}		
	}

}

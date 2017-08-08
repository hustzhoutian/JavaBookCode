package HomeWork;

public class Test4_6_1 {
	public static void main(String[] args) {
		int x =(int) System.currentTimeMillis();
		switch(x%2){
		case 0:
			System.out.println("x="+x+",是个偶数");
			break;
		case 1:
			System.out.println("x="+x+"是个奇数");
		}
		
	}

}

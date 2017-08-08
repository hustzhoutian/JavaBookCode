package Chapter10;

public class OverLoad {
	public static int add(int a,int b) {
		return a+b;
	}
	public static double add(double a,double b) {
		return a+b;
	}
	public static int add(int a) {
		return a;
	}
	public static double add(double a) {
		return a;
	}
	public static int add(int a,double b) {
		return 1;
	}
	public static double add(double a,int b){
		return 1.0;
	}
	public static double add(double...a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			 sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(add(1,2));
		System.out.println(add(1.0,2));
		System.out.println(add(1.0,2.0));
		System.out.println(add(1,2.0));
		System.out.println(add(5));
		System.out.println(add(8.0));
		System.out.println(add(1,2,34,5,2));
	}

}

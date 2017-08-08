package HomeWork;

public class Test4_6_3 {
	public static void main(String[] args) {
		double result = 0;
		for(int i=1;i<=20;i++){
			result=result+1.0/Fac(i);
		}
		System.out.println(result);
	}
	public static int Fac(int x) {
		int sum =1;
		for(int i=1;i<=x;i++){
			sum*=i;
		}
		return sum;
	}
}

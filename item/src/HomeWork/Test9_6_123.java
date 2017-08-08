package HomeWork;

import java.text.DecimalFormat;

import other.MathRondom;

public class Test9_6_123 {
	public static void CircleArea(String pattern,double r){
		DecimalFormat myformat = new DecimalFormat(pattern);
		double area = Math.PI*Math.pow(r,2);
		String out = myformat.format(area);
		System.out.println("圆的半径为："+r+" 圆的面积为："+out);
	}

	public static void main(String[] args) {
		// 9.6.1
		int sum = 0;
		int index = 0;
		int sum1 = 0;
		while(true){
			int random = (int) (2+Math.random()*(32-2));
			if(random%2==0){
				System.out.print(random+" ");
				index = index+1;
				sum = sum +random;
			}
			if(index==6){
				System.out.println(sum);
				break;
			}
		}
		
		for (int i = 0; i < 6; i++) {
			int random1 = MathRondom.GetEvenNum(2, 32);
			System.out.print(random1+" ");
			sum1 = sum1+random1;
		}
		System.out.println(sum1);
		
		//9.6.2
		CircleArea("#.#####", 2);
	}

}

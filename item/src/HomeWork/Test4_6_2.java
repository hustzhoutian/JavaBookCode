package HomeWork;

import java.util.Scanner;

public class Test4_6_2 {
	public static void main(String[] args) {
		System.out.println("«Î ‰»Î¡‚–Œ±ﬂ≥§£∫"); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<n-i+1;j++){
				System.out.print(" ");
			}
			for(int j=n-i+1;j<n+i;j++){
				System.out.print("*");
			}
			for(int j=n+1;j<n*2;j++){
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int j=1;j<n-i+1;j++){
				System.out.print(" ");
			}
			for(int j=n-i+1;j<n+i;j++){
				System.out.print("*");
			}
			for(int j=n+1;j<n*2;j++){
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}

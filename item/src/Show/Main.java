package Show;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lrc = sc.nextLine();
        int index = sc.nextInt();
        String[] arr = lrc.split(" ");
        int[] num = new int[arr.length];
        int[] num1 = new int[arr.length];
        for (int i = 0; i < num1.length; i++) {
			num1[i] = i;
		}
        for (int i = 0; i < arr.length; i++) {
			if (arr[i].length()<3) {
				num[i] = Integer.parseInt(arr[i]);
			} else {
				num[i] = Integer.parseInt(arr[i].substring(arr[i].length()-3, arr[i].length()));
			}
		}
        System.out.println(Integer.parseInt(arr[paiXu(num, num1, index)])); 
    }
    
    
    static int paiXu(int[] q,int[] p,int n) {
        for (int sx=0; sx<q.length-1; sx++) {
            for (int i=0; i<q.length-1-sx; i++) {
                if (q[i] > q[i+1] ) {
                    int temp = q[i];
                    q[i] = q[i+1];
                    q[i+1] = temp;
                    
                    int temp2 = p[i];             
                    p[i] = p[i+1];                    
                    p[i+1] = temp2;
                }
            }
        }
        return p[n-1];
    }
}
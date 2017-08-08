package other;


import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr = new int[10];
		Arrays.fill(arr,0,8,8);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		//6.4.3
		int[][] arr1 = new int[][]{{1,3,2},{5,3,4}};
		Arrays.sort(arr1[0]);
		Arrays.sort(arr1[1]);
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println(arr1[i][j]);
			}
		}
	}

}

package Show;

public class Show {
	public static void showArray(int[][] arr4) {
		// TODO 二维数组
		for (int[] is : arr4) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void showArray(String[] arr) {
		// TODO 字符串数组
		for (String string : arr) {
			System.out.print(string+" ");
		}
		System.out.println();
		
	}

	public static void showArray(int[] arr1) {
		// TODO 一维数组
		for (int i : arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}

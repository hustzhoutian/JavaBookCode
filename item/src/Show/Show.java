package Show;

public class Show {
	public static void showArray(int[][] arr4) {
		// TODO ��ά����
		for (int[] is : arr4) {
			for (int i : is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void showArray(String[] arr) {
		// TODO �ַ�������
		for (String string : arr) {
			System.out.print(string+" ");
		}
		System.out.println();
		
	}

	public static void showArray(int[] arr1) {
		// TODO һά����
		for (int i : arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}

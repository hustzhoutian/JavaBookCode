package other;


public class ReverseSort {

	public static void main(String[] args) {
		// TODO ��ת����
		int[] array = new int[]{10,20,30,40,50,60,70};
		ReverseSort sorter = new ReverseSort();
		sorter.sort(array);
	}

	private void sort(int[] array) {
		// TODO ����
		for (int i = 1; i <= array.length/2; i++) {
			int temp = 0;
			temp = array[array.length-i];
			array[array.length-i] = array[i-1];
			array[i-1] = temp;
		}
		showArray(array);
	}

	private void showArray(int[] array) {
		// TODO �������
		for (int i : array) {
			System.out.print(i+" ");
		}
	}

}

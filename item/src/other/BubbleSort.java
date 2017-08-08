package other;


public class BubbleSort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array = new int[]{63,4,24,1,3,15};
		BubbleSort sorter = new BubbleSort();
		sorter.sort(array);
		sorter.unsort(array);
	}

	private void unsort(int[] array) {
		// TODO 自动生成的方法存根
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j]<array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		showArray(array);
	}

	private void sort(int[] array) {
		// TODO 自动生成的方法存根
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		showArray(array);
	}

	private void showArray(int[] array) {
		// TODO 自动生成的方法存根
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}

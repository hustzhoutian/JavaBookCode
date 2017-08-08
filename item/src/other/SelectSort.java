package other;


public class SelectSort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array = new int[]{63,4,24,1,3,15};
		SelectSort sorter = new SelectSort();
		sorter.sort(array);
	}

	private void sort(int[] array) {
		// TODO 排序
		for (int i = 1; i < array.length; i++) {
			int index = 0;
			for (int j = 0; j <= array.length-i; j++) {
				if(array[j]>array[index]){
					index = j;
				}
			}
			int temp = array[array.length-i];
			array[array.length-i]=array[index];
			array[index] = temp;
		}
		showArray(array);
	}

	private void showArray(int[] array) {
		// TODO 输出数组
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}

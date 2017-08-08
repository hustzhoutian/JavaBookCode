package other;


import java.util.Arrays;

public class Cope {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] arr = new int[]{1,2,3};
		int[] newarr = Arrays.copyOf(arr, 5);
		for (int i = 0; i < newarr.length; i++) {
			System.out.println(newarr[i]);
		}
		//6.4.4 复制数组
		int[] newarr1 = Arrays.copyOfRange(arr, 0, 2);
		for (int i = 0; i < newarr1.length; i++) {
			System.out.println(newarr1[i]);
		}
		//6.4.5 数组查询
		int[] arr1 = new int[]{20,8,10};
		Arrays.sort(arr1);
		int index = Arrays.binarySearch(arr1, 21);
		System.out.println(index);
		
		String[] str = new String[]{"ab","xy","cc","yz"};
		int index1 = Arrays.binarySearch(str, 0, 3, "yz");
		System.out.println(index1);
	}

}

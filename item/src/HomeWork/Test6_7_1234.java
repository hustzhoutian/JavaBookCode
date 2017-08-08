package HomeWork;

import java.util.Arrays;

import Show.Show;
import other.AnyThing;
import other.Book;
import other.StaticTest;

public class Test6_7_1234 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//6.7.1
		int[] arr1 = new int[]{1,2,3,4,5,6};
		int[] arr2 = new int[3];
		arr2 = Arrays.copyOfRange(arr1, 0, 3);
		Show.showArray(arr1);
		Show.showArray(arr2);
		
		//6.7.2
		int[] arr3 = new int[]{0,1,0,0,21,8,12,0};
		int index = arr3[0];
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i]<index) {
				index = arr3[i];
			}			
		}
		System.out.println(index);
		
		
		//6.7.3
		String[] arr = new String[]{"ab","bc","cd"}; 
		Show.showArray(arr);
		arr[2] = "bb";
		Show.showArray(arr);
		
		//6.7.4
		int[][] arr4 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		Show.showArray(arr4);
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				System.out.print(arr4[j][i]+" ");
			}
			System.out.println();
		}
		
		Book book = new Book(2);
		System.out.println(book.getName());		
		AnyThing anything = new AnyThing("1");
		
		StaticTest statictest = new StaticTest();
		Test7_8_2 a = new Test7_8_2();
		System.out.println(a.getArea());
		//statictest.method2();
		//StaticTest.method1();
		//StaticTest.method3();
	}
}

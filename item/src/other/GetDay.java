package other;


public class GetDay {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] day = new int[]{31,28,31,30,31};
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1)+"月有"+day[i]+"天");
		}
		//6.3
		int[][] a = new int[3][4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}

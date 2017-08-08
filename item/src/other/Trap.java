package other;


public class Trap {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] b = new int[][]{{1},{2,3},{4,5,6}};
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		//6.11
		int[][] arr2 = {{4,3},{2,1}};
		int i = 0;
		for (int[] x : arr2) {
			i++;
			int j = 0;
			for (int e : x) {
				j++;
				if (i==arr2.length&&j==x.length) {
					System.out.print(e);
				}else
					System.out.print(e+"、");
			}
		}
	}

}

package GetOffer;

public class Solution1 {
	//二维数组中的查找
	public boolean Find(int target, int [][] array) {
		int x = array.length-1;
		int y = array[0].length;
		int n = 0;
		while (true) {
			if (x<0 || n>y-1) {
				return false;
			}
			if (target == array[x][n]) { 
				return true;
			} else {
				if (target > array[x][n]) {
					n++;
				} else {
					x--;
				}
			}
		}
    }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Solution1 b = new Solution1();
		int[][] a = {{1,2,3},{2,3,4},{1,3,4}};
		System.out.println(b.Find(100, a));
	}

}

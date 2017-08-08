package Chapter10;

public class Quadrangle {
	// 实例化保存四边形对象的数组对象
	private Quadrangle[] qtest = new Quadrangle[6];
	private int nextIndex = 0;
	public void draw(Quadrangle q){
		if (nextIndex < qtest.length) {
			qtest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Quadrangle q = new Quadrangle();
		q.draw(new Parallelogramgle());
		q.draw(new Square());		
	}

}

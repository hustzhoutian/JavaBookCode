package Chapter10;

public class Quadrangle {
	// ʵ���������ı��ζ�����������
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
		// TODO �Զ����ɵķ������
		Quadrangle q = new Quadrangle();
		q.draw(new Parallelogramgle());
		q.draw(new Square());		
	}

}

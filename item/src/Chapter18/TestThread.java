package Chapter18;

public class TestThread extends Thread{
	private int count = 10;
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while (true) {
			System.out.print(count);
			if (--count == 0) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new TestThread().start();
	}

}

package Chapter18;

public class TestThread extends Thread{
	private int count = 10;
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (true) {
			System.out.print(count);
			if (--count == 0) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new TestThread().start();
	}

}

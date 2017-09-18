package Chapter18;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class SleepMethodTest extends JFrame{
	private Thread t;
	private static Color[] color = {Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.ORANGE,Color.YELLOW,Color.RED,Color.PINK,Color.LIGHT_GRAY};
	private static final Random rand = new Random();
	private static Color getC(){
		return color[rand.nextInt(color.length)];
	}
	
	public SleepMethodTest() {
		// TODO �Զ����ɵĹ��캯�����
		t = new Thread(new Runnable() {
			int x = 300;
			int y = 100;
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				while (true) {
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					Graphics graphics = getGraphics();
					graphics.setColor(getC());
					graphics.drawLine(x, y, 100, y++);
					if (y >= 500) {
						y = 100;
					}
				}
			}
		});
		t.start();
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		init(new SleepMethodTest(),1000,1000);
	}

	public static void init(JFrame frame, int i, int j) {
		// TODO �Զ����ɵķ������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(i, j);
		frame.setVisible(true);
	}

}

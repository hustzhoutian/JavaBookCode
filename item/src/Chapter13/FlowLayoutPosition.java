package Chapter13;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition() {
		// TODO 自动生成的构造函数存根
		setTitle("流布局");
		Container c = getContentPane();
		setLayout(new FlowLayout(2, 10, 10));
		for (int i = 0; i < 10; i++) {
			c.add(new Button("button"+i));
		}
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FlowLayoutPosition();
	}
}

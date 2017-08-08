package Chapter13;

import java.awt.*;

import javax.swing.*;

public class BorderLayoutPosition extends JFrame{
	String[] border = {BorderLayout.CENTER,BorderLayout.NORTH,
			BorderLayout.SOUTH,BorderLayout.WEST,BorderLayout.EAST};
	String[] buttonName = {"中","北","南","西","东"};
	public BorderLayoutPosition() {
		// TODO 自动生成的构造函数存根
		setTitle("边界布局");
		Container c = getContentPane();
		setLayout(new BorderLayout());
		for (int i = 0; i < border.length; i++) {
			c.add(border[i], new JButton(buttonName[i]));
		}
		setVisible(true);
		setSize(350, 200);
	}
	
	public static void main(String[] args) {
		new BorderLayoutPosition();
	}
}

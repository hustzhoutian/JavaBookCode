package Chapter13;

import javax.swing.*;
import java.awt.*;

public class JPanleTest extends JFrame{
	public JPanleTest() {
		// TODO 自动生成的构造函数存根
		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1, 10, 10));
		JPanel jp1 = new JPanel(new GridLayout(2, 1, 10, 10));
		JPanel jp2 = new JPanel(new GridLayout(1, 3, 10, 10));
		JPanel jp3 = new JPanel(new GridLayout(1, 3, 10, 10));
		JPanel jp4 = new JPanel(new GridLayout(1, 3, 10, 10));
		jp1.add(new Button("1"));
		jp1.add(new Button("1"));
		jp1.add(new Button("1"));
		jp1.add(new Button("1"));
		jp2.add(new Button("2"));
		jp3.add(new Button("3"));
		jp4.add(new Button("4"));
		c.add(jp1);
		c.add(jp2);
		c.add(jp3);
		c.add(jp4);
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JPanleTest();
	}
}

package Chapter13;

import java.awt.*;
import javax.swing.*;

public class Test13_1 extends JFrame{
	public Test13_1() {
		// TODO 自动生成的构造函数存根
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		String[] test = {"红","橙","黄","绿","紫"};
		JComboBox<String> jc = new JComboBox<>(test);
		JRadioButton jr1 = new JRadioButton("男");
		JButton jb1 = new JButton("确定");
		JButton jb2 = new JButton("取消");
		JRadioButton jr2 = new JRadioButton("女");
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(jr1);
//		bg.add(jr2);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		c.add(jp1, BorderLayout.NORTH);
		jp1.add(jc);
		c.add(jp2, BorderLayout.CENTER);
		jp2.add(jr1);
		jp2.add(jr2);
		c.add(jp3, BorderLayout.SOUTH);
		jp3.add(jb1);
		jp3.add(jb2);
		setSize(300, 300);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Test13_1();
	}

}

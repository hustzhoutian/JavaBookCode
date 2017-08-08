package Chapter13;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JTextFieldTest extends JFrame{
	public JTextFieldTest() {
		// TODO 自动生成的构造函数存根
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		final JTextField jt = new JTextField("aaa", 20);
		final JButton jb = new JButton("清除");
		c.add(jt);
		c.add(jb);
		jt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jt.setText("触发事件");
			}
		});
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jt.setText("");
				jt.requestFocus();
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JTextFieldTest();
	}

}

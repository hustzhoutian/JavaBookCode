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
		// TODO �Զ����ɵĹ��캯�����
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		final JTextField jt = new JTextField("aaa", 20);
		final JButton jb = new JButton("���");
		c.add(jt);
		c.add(jb);
		jt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				jt.setText("�����¼�");
			}
		});
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				jt.setText("");
				jt.requestFocus();
			}
		});
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JTextFieldTest();
	}

}

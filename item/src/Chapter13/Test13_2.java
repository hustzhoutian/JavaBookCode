package Chapter13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test13_2 extends JFrame{
	public Test13_2() {
		// TODO �Զ����ɵĹ��캯�����
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		String[] test = {};
		String[] test1 = {"��","Ů"};
		JComboBox<String> jc = new JComboBox<>(test);
		c.add(jc,BorderLayout.NORTH);
		JButton jb = new JButton("���");
		c.add(jb, BorderLayout.CENTER);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				for (int j = 0; j < test1.length; j++) {
					jc.addItem(test1[j]);
				}				
			}
		});
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Test13_2();
	}

}

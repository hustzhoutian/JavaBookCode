package Chapter13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CheckBoxTest extends JFrame{
	public CheckBoxTest() {
		// TODO 自动生成的构造函数存根
		Container c = getContentPane();
		setSize(500, 500);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JCheckBox jc1 = new JCheckBox("1");
		JCheckBox jc2 = new JCheckBox("2");
		JCheckBox jc3 = new JCheckBox("3");				
		c.setLayout(new BorderLayout());
		c.add(panel1, BorderLayout.NORTH);
		JTextArea jt = new JTextArea(5, 10);
		final JScrollPane scrollPane = new JScrollPane(jt);
		panel1.add(scrollPane);
		c.add(panel2, BorderLayout.SOUTH);
		panel2.add(jc1);
		jc1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jt.append("复选框1被选中\n");
			}
		});
		panel2.add(jc2);
		jc2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jt.append("复选框2被选中\n");
			}
		});
		panel2.add(jc3);
		jc3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jt.append("复选框3被选中\n");
			}
		});
		setVisible(true);
		setTitle("复选框");		
	}
	
	public static void main(String[] args) {
		new CheckBoxTest();
	}
}

package Chapter13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame{
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new MyFrame().setVisible(true);;
	}
	
	public MyFrame(){
		Container container = getContentPane();
		container.setLayout(null);
		JLabel jl = new JLabel("1");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton jb = new JButton("按钮");
		jb.setBounds(10,10,100,21);
		container.add(jb);
		JRadioButton j1 = new JRadioButton("1");
		JRadioButton j2 = new JRadioButton("1");
		JRadioButton j3 = new JRadioButton("1");
		ButtonGroup bg = new ButtonGroup();
		bg.add(j1);
		bg.add(j2);
		bg.add(j3);
		j1.setBounds(30, 30, 100, 21);
		j2.setBounds(30, 80, 100, 21);
		j3.setBounds(30, 200, 100, 21);
		container.add(j1);
		container.add(j2);
		container.add(j3);
		setSize(400, 400);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				new MyJDialog(MyFrame.this).setVisible(true);
			}
		});
		
	}
}

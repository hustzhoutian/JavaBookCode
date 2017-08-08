package Chapter13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test13_3 extends JFrame{
	public Test13_3() {
		// TODO 自动生成的构造函数存根
		Container c = getContentPane();
		setTitle("登录");
		c.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JLabel jl1 = new JLabel("用户名:");
		JLabel jl2 = new JLabel("密码：");
		JTextField jt = new JTextField(8);
		JPasswordField jw = new JPasswordField(8);
		jw.setEchoChar('*');
		JButton jb1 = new JButton("提交");
		JButton jb2 = new JButton("重置");
		c.add(jp1,BorderLayout.NORTH);
		jp1.add(jl1);
		jp1.add(jt);
		c.add(jp2,BorderLayout.CENTER);
		jp2.add(jl2);
		jp2.add(jw);
		c.add(jp3,BorderLayout.SOUTH);
		jp3.add(jb1);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				if ((jt.getText().equals("mr"))&(String.valueOf(jw.getPassword()).equals("mrsoft"))) {
					JOptionPane.showMessageDialog(null, "登录成功");
				} else {
					JOptionPane.showMessageDialog(null, "用户名或密码错误");
					jt.setText("");
					jw.setText("");
					jt.requestFocus();
				}
			}
		});
		jp3.add(jb2);
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				jt.setText("");
				jw.setText("");
			}
		});
		setSize(300, 200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Test13_3();
	}
}

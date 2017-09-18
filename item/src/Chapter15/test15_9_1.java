package Chapter15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class test15_9_1 extends JFrame{
	public test15_9_1() {
		// TODO 自动生成的构造函数存根
		setTitle("进度条");
		Container c = getContentPane();
		setLayout(null);
//		setBounds(0, 0, 1000, 200);
		JButton jb = new JButton("读取");
		jb.setBounds(420, 400, 160, 80);
		c.add(jb);
		JTextArea jta=new JTextArea();  
        JScrollPane jsp=new JScrollPane(jta);  
        jsp.setBounds(0,0, 800,300);
        c.add(jsp);
		setVisible(true);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				new Thread()
				{
					public void run() {
						try {
							byte[] b = new byte[2];
							FileInputStream fis = new FileInputStream("word.txt");
							ProgressMonitorInputStream in = new ProgressMonitorInputStream(c,"读取文件",fis);  
				            while(in.read(b)!=-1){  
				                String s = new String(b);  
				                jta.append(s);  
				                Thread.sleep(100);//设置读取速度，100毫秒一次  
				            } 
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
				}.start();
			}
		});
		setSize(1000, 600);
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根		
		new test15_9_1();
	}

}

package Chapter15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class test15_9_1 extends JFrame{
	public test15_9_1() {
		// TODO �Զ����ɵĹ��캯�����
		setTitle("������");
		Container c = getContentPane();
		setLayout(null);
//		setBounds(0, 0, 1000, 200);
		JButton jb = new JButton("��ȡ");
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
				// TODO �Զ����ɵķ������
				new Thread()
				{
					public void run() {
						try {
							byte[] b = new byte[2];
							FileInputStream fis = new FileInputStream("word.txt");
							ProgressMonitorInputStream in = new ProgressMonitorInputStream(c,"��ȡ�ļ�",fis);  
				            while(in.read(b)!=-1){  
				                String s = new String(b);  
				                jta.append(s);  
				                Thread.sleep(100);//���ö�ȡ�ٶȣ�100����һ��  
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
		// TODO �Զ����ɵķ������		
		new test15_9_1();
	}

}

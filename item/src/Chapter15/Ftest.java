package Chapter15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class Ftest extends JFrame{
	public Ftest() {
		// TODO �Զ����ɵĹ��캯�����
		Container c = getContentPane();
		setTitle("all");
		setSize(300, 300);
		c.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JTextArea jt = new JTextArea(10, 10);
		JScrollPane js = new JScrollPane(jt);
		c.add(jp1, BorderLayout.NORTH);
		jp1.add(js);
		JButton jb1 = new JButton("д���ļ�");
		JButton jb2 = new JButton("��ȡ�ļ�");
		JButton jb3 = new JButton("���ļ�");
		c.add(jp2,BorderLayout.SOUTH);
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		File file = new File("D:\\workspace\\item\\word.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				try {
					FileWriter write = new FileWriter(file);
					write.write(jt.getText());
					write.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				try {
					FileReader reader = new FileReader(file);
					char[] byt = new char[1024];
					int len = reader.read(byt);
					jt.setText(new String(byt, 0, len));
					reader.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				try {
					String file = "rundll32 url.dll FileProtocolHandler file://D:\\workspace\\item\\word.txt";
					Runtime.getRuntime().exec(file);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Ftest();
	}

}
